package inheritance;
class Birds{
	public  void birdsDetails()
	{
		System.out.println("Birds Details");
		}
}
class Hen extends Birds
{
	public void henmthd() {
		System.out.println("Hen Details");
	}	
}
class Chicken extends Hen
{
	public void chicknmthd() {
		System.out.println("Chicken Details");

	}
}
public class MultiLeInheritance {

	public static void main(String[] args) {
		
Chicken ob=new Chicken();
ob.birdsDetails();
ob.henmthd();
ob.chicknmthd();

	}
}
