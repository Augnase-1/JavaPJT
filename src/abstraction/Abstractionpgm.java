package abstraction;

abstract class Cars{
	abstract public void acceleration();
	public void carEngine() {
	System.out.println("Engine Details");
	}
}
class Kia extends Cars{

	@Override
	public void acceleration() {
	System.out.println("kia acceleration");
	}
}
class Maruthi extends Cars{

	@Override
	public void acceleration() {
		System.out.println("Maruthi acceleration");
	}	
}

public class Abstractionpgm {
	public static void main(String[] args) {
		Kia ob=new Kia();
		ob.acceleration();
		ob.carEngine();
	}
}

