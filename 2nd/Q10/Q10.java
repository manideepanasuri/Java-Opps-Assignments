
import java.util.Scanner;

public class Q10{
  public static void main(String[] args) {

    Scanner obj=new Scanner(System.in);
    list head=new list();
    while (true) { 
      System.out.println("enter 1 to add new student\nenter 2 to change department of the student\nenter 3 to print student data");
      int n=obj.nextInt();
      
      if(n==1){
        System.out.println("enter Student name");
        String name=obj.next();
        System.out.println("enter Student rollNo");
        String rollNo=obj.next();
        System.out.println("enter Student year");
        int year=obj.nextInt();
        System.out.println("enter Student homeTown");
        String homeTown=obj.next();
        System.out.println("enter Student departmentName");
        String departmentName=obj.next();
        System.out.println("enter no of faculty in that department");
        int faculty=obj.nextInt();
        head.insert(name, rollNo, year, homeTown, departmentName, faculty);
      }
      else if(n==2){
        System.out.println("enter Student rollNo");
        String rollNo=obj.next();
        System.out.println("enter department to migrate to");
        String departmentName=obj.next();
        System.out.println("enter no of faculty in that department");
        int faculty=obj.nextInt();
        head.migrate(rollNo, departmentName, faculty);
      }
      else if(n==3){
        System.out.println("enter Student rollNo");
        String rollNo=obj.next();
        head.find(rollNo);
      }
      else{return;}
    }
    
  }
}


interface department {
  String departmentName="dep";
  int faculty=0;
  void printDepartment();
}
class hostel{
  String name;
  int numberOfRooms;
  void print_hostel(){
    System.out.println("Hostel Name: "+name);
    System.out.println("Number of Rooms: "+numberOfRooms);
  }
}

class Student extends hostel implements  department{
    String name;
    String rollNo;
    int year;
    String departmentName;
    int faculty;
    String homeTown;
    Student next=null;
    Student(String name,String rollno,int year,String homeTown,String departmentName,int faculty){
      this.name=name;
      this.rollNo=rollno;
      this.year=year;
      this.homeTown=homeTown;
      this.departmentName=departmentName;
      this.faculty=faculty;
    }
    public void printDepartment() {
      System.out.println("Name: "+this.name);
      System.out.println("Roll no: "+this.rollNo);
      System.out.println("Year: "+this.year);
      System.out.println("Home Town: "+this.homeTown);
      System.out.println("Department Name: "+this.departmentName);
      System.out.println("No.of Faculty: "+faculty );
    }
  
}

class list{
  Student head=null;
  Student insert(String name,String rollno,int year,String homeTown,String  departmentName,int faculty){
    Student temp=new Student(name, rollno, year, homeTown, departmentName, faculty);
    if(this.head==null){
      this.head=temp;
    }
    else{
      Student temp1=head;
      while(temp1.next!=null){
        temp1=temp1.next;
      }
      temp1.next=temp;
    }
    return temp;
  }
  boolean migrate(String rollNo,String departmentName,int faculty){
    Student temp=head;
    while(temp.next!=null){
      if(temp.rollNo.equals(rollNo)){
        temp.departmentName=departmentName;
        temp.faculty=faculty;
        return true;
      }
      temp=temp.next;
    }
    System.out.println("no student exists");
    return false;
  }
  Student find(String rollNo){
    Student temp=this.head;
    while(temp!=null){
      if(temp.rollNo.equals(rollNo)){
        temp.printDepartment();
        temp.print_hostel();
        return temp;
      }
      temp=temp.next;
    }
    return null;
  }
}