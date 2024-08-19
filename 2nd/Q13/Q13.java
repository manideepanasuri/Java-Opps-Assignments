public class Q13{
	public static void main(String args[]){
	  Employe E1=new Employe("Srinivas",30,"9483765939","Hno:123-45-67",30000,"java");
	  E1.printData();
	  E1.printSalary();
	  Manager M1=new Manager("Manideep",22,"1234567890","Hno:123-45-678",500000,"Techinical");
	  M1.printData();
	  M1.printSalary();
	}
}

class Member{
  String Name;
  int age;
  String phoneNum;
  String Adress;
  int salary;
  void printSalary(){
    System.out.println("salary is: "+this.salary);
  }
}
class Employe extends Member{
  String specialization;
  Employe(String Name,int age,String phoneNum,String Adress,int salary,String specialization){
    this.Name=Name;
    this.age=age;
    this.phoneNum=phoneNum;
    this.Adress=Adress;
    this.salary=salary;
    this.specialization=specialization;
  }
  void printData(){
    System.out.println("\nEmploye:\n");
    System.out.println("Name: "+this.Name);
    System.out.println("age: "+this.age);
    System.out.println("phoneNum: "+this.phoneNum);
    System.out.println("Adress: "+this.Adress);
    System.out.println("salary: "+this.salary);
    System.out.println("specialization: "+this.specialization);
  }
}
class Manager extends Member{
  String department;
  Manager(String Name,int age,String phoneNum,String Adress,int salary,String department){
    this.Name=Name;
    this.age=age;
    this.phoneNum=phoneNum;
    this.Adress=Adress;
    this.salary=salary;
    this.department=department;
  }
  void printData(){
    System.out.println("\nManager:\n");
    System.out.println("Name: "+this.Name);
    System.out.println("age: "+this.age);
    System.out.println("phoneNum: "+this.phoneNum);
    System.out.println("Adress: "+this.Adress);
    System.out.println("salary: "+this.salary);
    System.out.println("department: "+this.department);
  }
}
