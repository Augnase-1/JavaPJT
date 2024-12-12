package method;

public class Employee {
	int empid;
	String empname;
	
	public Employee(int empid,String empname) {
		this.empid=empid;
		this.empname=empname;
	}
	public void display() {
		System.out.println("Employee id="+empid);
		System.out.println("Employee name="+empname);

	}
	public static void main(String[] args) {
		Employee emp=new Employee(10,"Augnes");
		emp.display();
	}
	}

	

