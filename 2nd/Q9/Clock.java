import java.util.Scanner;

public class Clock{
  int hours;
  int minutes;
  int seconds;
  
  Clock(int hours,int minutes,int seconds){
    if(seconds/60>=1){
        minutes=minutes+seconds/60;
        seconds=seconds%60;
        
        if(minutes/60>=1){
          hours=hours+minutes/60;
          minutes=minutes%60;
          
        }
      }
    this.hours=hours;
    this.minutes=minutes;
    this.seconds=seconds;
  }
  
  Clock add(Clock obj){
    int sec=this.seconds+obj.seconds;
    int min=this.minutes+obj.minutes;
    int hrs=this.hours+obj.hours;    
    return new Clock(hrs,min,sec);    
  }
  
  void print(){
    System.out.println(this.hours+":"+this.minutes+":"+this.seconds);
  }
  
  public static void main(String args[]){
    int hrs;
    int mins;
    int sec;
    Scanner obj=new Scanner(System.in);
    //inputing 1st clock
    System.out.println("Please enter hrs of 1st clock");
    hrs=obj.nextInt();
    System.out.println("Please enter mins of 1st clock");
    mins=obj.nextInt();
    System.out.println("Please enter sec of 1st clock");
    sec=obj.nextInt();
    
    Clock c1=new Clock(hrs,mins,sec);
    //inputing 2nd clock
    System.out.println("Please enter hrs of 2nd clock");
    hrs=obj.nextInt();
    System.out.println("Please enter mins of 2nd clock");
    mins=obj.nextInt();
    System.out.println("Please enter sec of 2nd clock");
    sec=obj.nextInt();
    
    Clock c2=new Clock(hrs,mins,sec);
    Clock c3=c1.add(c2);
    c1.print();
    c2.print();
    c3.print();
  }
  
}
