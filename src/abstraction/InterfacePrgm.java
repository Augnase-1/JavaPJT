package abstraction;
interface CarDetails{
	public void accceleration();
	public void speedlimit();
	public void torque();
}
class Benz implements CarDetails{

	@Override
	public void accceleration() {
    System.out.println("Benz acceleration");		
	}

	@Override
	public void speedlimit() {
	System.out.println("Benz Speedlimit");		
	}

	@Override
	public void torque() {
	System.out.println("Benz Torque");		
	}
}
    public class InterfacePrgm {
	public static void main(String[] args) {
    Benz ob=new Benz();
    ob.accceleration();
    ob.speedlimit();
    ob.torque();
	}
}
