import java.util.Scanner;

class Q2{
	public static void main(String[] args){
	  int[][] array;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the number");
		int n=obj.nextInt();
		if(n==0){System.out.print("matrix size cannot be 0");return ;}
		array=new int[n][n];
		System.out.println("enter "+n+"X"+n +" Matrix");
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				obj=new Scanner(System.in);
				int temp=obj.nextInt();
				array[i][j]=temp;
			}
		}
		for(int i=0;i<n;i++){
			for(int j=i;j<n;j++){
				int temp=array[i][j];
				array[i][j]=array[j][i];
				array[j][i]=temp;
			}
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(array[i][j]);
				
			}
			System.out.print("\n");
		}
	}
}
