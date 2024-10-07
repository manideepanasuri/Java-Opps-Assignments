import java.util.Scanner;

public class Q5 {
    public static int i = 2;
    public static int sum = 0;
    static final Object lock = new Object();

    public static boolean isPrime(int a) {
        for (int i = 2; i <= a / 2; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner jin = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = jin.nextInt();
        Thread t1 = new Thread() {
            public void run() {
                while (i <= n) {
                    synchronized (lock) {
                        if (i > n) {
                            lock.notify();
                            break;
                        }
                        System.out.println(currentThread().getName());
                        lock.notify();
                        if (isPrime(i)) {
                            sum += i;
                        }
                        i++;
                        try {
                            lock.wait(100);
                        } catch (InterruptedException e) {
                        }
                    }
                }
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                while (i <= n) {
                    synchronized (lock) {
                        if (i > n) {
                            lock.notify();
                            break;
                        }
                        System.out.println(currentThread().getName());
                        lock.notify();
                        if (isPrime(i)) {
                            sum += i;
                        }
                        i++;
                        try {
                            lock.wait(100);
                        } catch (InterruptedException e) {
                        }
                    }
                }
            }
        };
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
        }
        System.out.println("The sum of all the prime numbers up to " + n + " is " + sum);
        jin.close();
    }
}
