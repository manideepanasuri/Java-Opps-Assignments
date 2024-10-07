class BankAccount {
    private int balance = 0;

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " deposited: " + amount + ", Balance: " + balance);
    }

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " withdrew: " + amount + ", Balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " tried to withdraw: " + amount
                    + " but insufficient balance. Current Balance: " + balance);
        }
    }

    public synchronized int getBalance() {
        return balance;
    }
}

class DepositThread extends Thread {
    private BankAccount account;
    private int amount;

    public DepositThread(BankAccount account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.deposit(amount);
    }
}

class WithdrawThread extends Thread {
    private BankAccount account;
    private int amount;

    public WithdrawThread(BankAccount account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.withdraw(amount);
    }
}

public class Q6 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Thread t1 = new DepositThread(account, 100);
        Thread t2 = new WithdrawThread(account, 50);
        Thread t3 = new DepositThread(account, 200);
        Thread t4 = new WithdrawThread(account, 300);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Balance: " + account.getBalance());
    }
}
