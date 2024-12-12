package inheritance;
class Car{
	public void displaymthd()
{
System.out.println("car details");
}
}

class Bmw extends Car{
	public void bmwDetails()
	{
		System.out.println("Bmw car details");

	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		Bmw ob=new Bmw();
		ob.displaymthd();// parent class method
        ob.bmwDetails();//child class method

	}
}
