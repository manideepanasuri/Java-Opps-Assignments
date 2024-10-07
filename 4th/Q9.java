public class Q9 {

  // Shared resources
  private static final Object resource1 = new Object(); // Lock 1
  private static final Object resource2 = new Object(); // Lock 2
  private static final Object resource3 = new Object(); // Lock 3

  public static void main(String[] args) {
      // Thread 1 tries to lock resource1, then resource2
      Thread thread1 = new Thread(() -> {
          synchronized (resource1) {
              System.out.println("Thread 1: Locked resource 1");

              try { Thread.sleep(100); } catch (InterruptedException e) {}

              System.out.println("Thread 1: Waiting for resource 2");
              synchronized (resource2) {
                  System.out.println("Thread 1: Locked resource 2");
              }
          }
      });

      // Thread 2 tries to lock resource2, then resource3
      Thread thread2 = new Thread(() -> {
          synchronized (resource2) {
              System.out.println("Thread 2: Locked resource 2");

              try { Thread.sleep(100); } catch (InterruptedException e) {}

              System.out.println("Thread 2: Waiting for resource 3");
              synchronized (resource3) {
                  System.out.println("Thread 2: Locked resource 3");
              }
          }
      });

      // Thread 3 tries to lock resource3, then resource1
      Thread thread3 = new Thread(() -> {
          synchronized (resource3) {
              System.out.println("Thread 3: Locked resource 3");

              try { Thread.sleep(100); } catch (InterruptedException e) {}

              System.out.println("Thread 3: Waiting for resource 1");
              synchronized (resource1) {
                  System.out.println("Thread 3: Locked resource 1");
              }
          }
      });

      // Start all threads
      thread1.start();
      thread2.start();
      thread3.start();
  }
}
