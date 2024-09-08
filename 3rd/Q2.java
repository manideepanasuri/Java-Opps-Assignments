import java.util.Scanner;

public class Q2{
	public static void main(String args[]) throws NotFit,NotCorrect{
	  int[] t1=new int[3];
	  int[] t2=new int[3];
	  int[] t3=new int[3];
	  Scanner obj=new Scanner(System.in);
	  for(int i=0;i<3;i++){
	  //todo if input>100 or<1 
	    System.out.println("Enter the "+(i+1)+"of 1st participant");
	    t1[i]=obj.nextInt();
	    if(t1[i]>100||t1[i]<1){
	      throw new NotCorrect("Enter correct value");
	    }
	    System.out.println("Enter the "+(i+1)+"of 2st participant");
	    t2[i]=obj.nextInt();
	    if(t1[i]>100||t1[i]<1){
	      throw new NotCorrect("Enter correct value");
	    }
	    System.out.println("Enter the "+(i+1)+"of 2st participant");
	    t3[i]=obj.nextInt();
	    if(t1[i]>100||t1[i]<1){
	      throw new NotCorrect("Enter correct value");
	    }
	  }
	  int t1avg=(t1[0]+t1[1]+t1[2])/3;
	  int t2avg=(t2[0]+t2[1]+t2[2])/3;
	  int t3avg=(t3[0]+t3[1]+t3[2])/3;
	  int max=Math.max(t1avg,Math.max(t2avg,t3avg));
	  if(max<70){
	  //throw error;
	    throw new NotFit();
	  }
	  else{
	    if(max==t1avg){
	      System.out.println("Trainee 1 is fittest with oxygen level of "+max);
	      
	    }
	    if(max==t2avg){
	      System.out.println("Trainee 2 is fittest with oxygen level of "+max);
	      
	    }
	    if(max==t3avg){
	      System.out.println("Trainee 3 is fittest with oxygen level of "+max);
	      
	    }
	  }
	  
	}
}

class NotFit extends Exception{
  NotFit(){
    super("All trainees are Unfit");
  }
}
class NotCorrect extends Exception{
   NotCorrect(String p){
    super(p);
   }
}
