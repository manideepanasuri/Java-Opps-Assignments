
public class Q2 {
  public static void main(String[] args) {
    product p=new product(1000);
    producer t1=new producer(p);
    consumer t2=new consumer(p);
    consumer t3=new consumer(p);
    t1.t.start();
    t2.t.start();
    t3.t.start();
    try {
      t1.t.join();
      t2.t.join();
      t3.t.join();
    } catch (Exception e) {
      // TODO: handle exception
      System.out.println(e);
    }
  }
}

class product{
  int num=0;
  int max;
  product(int max){
    this.max=max;
  }  
}

class producer implements Runnable{
  product p;
  Thread t=new Thread(this);
  producer(product num){
    this.p=num;
  }
  public void run(){
    synchronized (p) {
      while(true){
        if(p.num==p.max){
          try {
            p.wait();
            //Thread.sleep(200);
          } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
          }
        }
        else{
          p.num++;          
          p.notifyAll();
          System.out.println("producer: "+p.num);        
        }
        
      }
    }
  }
}

class consumer implements Runnable{
  product p;
  Thread t=new Thread(this);
  consumer(product p){
    this.p=p;
  }
  public void run(){
    synchronized (p) {
      while(true){
        if(p.num==0){
          //p.notify();
          try {
            p.wait();
            //Thread.sleep(200);
          } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
          }
        }
        else{

          p.num--;
          p.notify();
          System.out.println("consumer: "+p.num);
        }
      }
    }
  }
}

