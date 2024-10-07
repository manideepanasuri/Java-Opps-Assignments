


public class Q1 {
  public static void main(String[] args) {
    printusing t1=new printusing("Java");
    printusing t2=new printusing("Opps");
    long milli=System.currentTimeMillis();
    t1.t.start();
    t2.t.start();
    while(true){
      //System.out.println("hi i am manideep");
      long mill2=System.currentTimeMillis();
      if(mill2-milli>=2000){
        t1.stop1();
        t2.stop1();
        break;
      }
    }
    System.out.println("Time elapsed:"+(System.currentTimeMillis()-milli)+" ms");
    System.out.println("main thread exiting");
  }
}

class printusing implements Runnable{
  String p;
  boolean isStopped;
  Thread t=new Thread(this);
  printusing(String q){
    p=q;
  }
  public void run(){
    while(!isStopped){
      System.out.println(p);
      try {
        Thread.sleep(100);
      } catch (Exception e) {
        
        System.out.println(e);
      }
    }
  }
  public void stop1(){
    isStopped=true;
  }
}