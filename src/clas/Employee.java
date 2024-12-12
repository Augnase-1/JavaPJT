package clas;

public class Employee {
	
	int empid;
	String empname;
	String empdesgn;

	public static void main(String[] args) {
		// object creation
		
     Employee emp1=new Employee();
     System.out.println(emp1.empid=101);
     System.out.println(emp1.empname="Augnase");
     System.out.println(emp1.empdesgn="Test Engineer");
     
     Employee emp2=new Employee();
     System.out.println(emp2.empid=102);
     System.out.println(emp2.empname="Liya");
     System.out.println(emp2.empdesgn="Software Engineer");
     
     Employee emp3=new Employee();
     System.out.println(emp3.empid=102);
     System.out.println(emp3.empname="Zamaan");
     System.out.println(emp3.empdesgn="Test Engineer");
	}
 
}
