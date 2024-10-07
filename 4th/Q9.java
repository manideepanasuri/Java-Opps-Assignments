public class Q9 {

    static final Object resource1 = new Object(); 
    static final Object resource2 = new Object(); 
    static final Object resource3 = new Object(); 

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1: Locked resource 1");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                }

                System.out.println("Thread 1: Waiting for resource 2");
                synchronized (resource2) {
                    System.out.println("Thread 1: Locked resource 2");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Thread 2: Locked resource 2");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                }

                System.out.println("Thread 2: Waiting for resource 3");
                synchronized (resource3) {
                    System.out.println("Thread 2: Locked resource 3");
                }
            }
        });

        Thread thread3 = new Thread(() -> {
            synchronized (resource3) {
                System.out.println("Thread 3: Locked resource 3");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                }

                System.out.println("Thread 3: Waiting for resource 1");
                synchronized (resource1) {
                    System.out.println("Thread 3: Locked resource 1");
                }
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
