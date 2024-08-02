/*
     9. Create a class called as Company which is a base class with name and salary as fields and take 5 employee details as input from the user. Derive one class containing methods dispMin() and dispMax() to display the employee name with minimum and maximum salary. Derive another class containing the methods avgSalary() and difference() which displays the average salary of employee and the difference between maximum and minimum salary. Write a Java program to implement the same.
Test Case:
Input:       	Name               	salary
           	        	John   	         	10,000
                   		Mike                 	21,300
                   		Bruce                	18,700
                  	 	Michael            	56,936
                   		Julie                  	41, 749
Output:
                   		Min Salary: 10,000
                   		Max Salary: 56,936
                   		Avg. Salary: 29,737
                   		Difference: 46,936

*/

import java.util.Scanner;


public class Q9 {
  public static void main(String[] args) {
    Head list=new Head();
    Scanner inp=new Scanner(System.in);
    System.out.println("enter the no.of workers");
    int n=inp.nextInt();
    for(int i=0;i<n;i++){
      System.out.println("Enter the name of Worker");
      String name=inp.next();
      System.out.println("Enter the salaries");
      int salary=inp.nextInt();
      list.add(name, salary);
    }
    System.out.print("min salary is :");
    list.dispMin();
    System.out.println();
    System.out.print("max salary is :");
    list.dispMax();
    System.out.println();
    System.out.print("avgSalary is :");
    list.avgSalary();
    System.out.println();
    System.out.print("difference is : ");
    list.difference();
    System.out.println();

  }
}

class Company {

  String name;
  int salary;

  Company(String name, int salary) {
    this.name = name;
    this.salary = salary;
  }
}

class dispMinMax extends Company {

  static int minS = Integer.MAX_VALUE;
  static int maxS = Integer.MIN_VALUE;
  static String minN;
  static String maxN;

  dispMinMax(String name, int salary) {
    super(name, salary);
    if (salary > maxS) {
      maxS = salary;
      maxN = name;
    }
    if (salary < minS) {
      minS = salary;
      minN = name;
    }
  }

  static void dispMin() {
    System.out.println(minN + " : " + minS);
  }

  static void dispMax() {
    System.out.println(maxN + " : " + maxS);
  }
}

class finalclass extends dispMinMax{
  static int total=0;
  static int num=0;
  finalclass next=null;
  finalclass(String name,int salary){
    super(name,salary);
    total=total+salary;
    num++;
  }
  static void avgSalary(){
    System.out.println("avgSalary is : "+total/num);
  }
  static void difference(){
    System.out.println("the difference btw max and min salaries is : "+ (maxS-minS));
  }
}

class Head{
  finalclass next=null;
  void add(String name,int salary){
    if(next==null){
      next=new finalclass(name,salary);
    }
    else{
      finalclass temp=next;
      while(temp.next!=null){
        temp=temp.next;
      }
      temp.next=new finalclass(name,salary);
    }
  }
  void dispMin(){
    finalclass.dispMin();
  }
  void dispMax(){
    finalclass.dispMax();
  }
  void avgSalary(){
    finalclass.avgSalary();
  }
  void difference(){
    finalclass.difference();
  }
}