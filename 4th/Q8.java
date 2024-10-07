public class Q8 {
  public static void main(String[] args) {
      num n = new num(100);  // Shared num object
      print p = new print(n); // Thread p
      print q = new print(n); // Thread q
      print r = new print(n); // Thread r

      q.t.setName("q");
      p.t.setName("P");
      //r.t.setName("r");

      p.t.start();
      q.t.start();
      //r.t.start();

      try {
          p.t.join();
          q.t.join();
          //r.t.join();
      } catch (Exception e) {
          System.out.println(e);
      }
  }
}

class num {
  int n = 0;
  int max;

  num(int n) {
      this.max = n;
  }

  synchronized public void inc() {
      System.out.println(n);
      n++;
  }
}

class print implements Runnable {
  num n;
  Thread t = new Thread(this);

  print(num n) {
      this.n = n;
  }

  public void run() {
      while (true) {
          synchronized (n) {
              if (n.n >= n.max) {
                  // If the current value exceeds the max, notify all and exit
                  n.notify();
                  break;
              }

              System.out.println(this.t.getName() + ": " + n.n);
              n.inc();
              
              n.notify(); // Notify other threads
              
              try {
                  // Wait until it's this thread's turn again
                  n.wait();
              } catch (InterruptedException e) {
                  System.out.println(e);
              }
          }
      }
  }
}
