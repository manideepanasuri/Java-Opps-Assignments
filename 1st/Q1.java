/*
	Write a program in Java to determine whether a given matrix is a sparse matrix or not.
 */

import java.util.Scanner;


class Q1{
	public static void main(String[] args){
		int[][] array;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the number");
		int n=obj.nextInt();
		if(n==0){System.out.print("matrix size cannot be 0");return ;}
		array=new int[n][n];
		int zeroCount=0;
		System.out.println("enter "+n+"X"+n +" Matrix");
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				obj=new Scanner(System.in);
				int temp=obj.nextInt();
				array[i][j]=temp;
				if(array[i][j]==0){zeroCount++;}
			}
		}
		int sizeOfArray=n*n;
		double sparseCondition=(double)2/(double)3;
		double currentMatrix=zeroCount/sizeOfArray;
		System.out.println(sparseCondition);
		System.out.println(currentMatrix);
		if(currentMatrix>=sparseCondition){
			System.out.print("Sparse Matrix");
		}
		else{
			System.out.print("Not a Sparse Matrix");
		}
		
	}
}