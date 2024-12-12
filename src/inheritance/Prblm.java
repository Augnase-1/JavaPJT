package inheritance;
import java.util.Scanner;
class Members{
	String name;
	int age;
	int phonenumber;
	String address;
	int salary;
public void displaymthd()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Name: "+name);
	System.out.println("Age: "+age);
	System.out.println("Phonenumber:"+phonenumber);
	System.out.println("Address: "+address);
	System.out.println("Salary:"+salary);
}
}
class Employee extends Members{
	String Department;
	}
class Manager extends Members{
String Specialization;
}
public class Prblm {

	public static void main(String[] args) {
Employee emp=new Employee();
emp.name="Eva";
emp.age=22;
emp.phonenumber=81298609;
emp.address="Ernakulam";
emp.salary=25000;
System.out.println(emp.Department="Data scientist");
emp.displaymthd();
System.out.println();
	Manager man=new Manager();
	man.name="Liya";
	man.age=21;
	man.phonenumber=987347;
	man.address="palakkad";
	man.salary=20000;
	System.out.println(man.Specialization="Data analyst");
	man.displaymthd();
	}
}
	
	
