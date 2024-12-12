package abstraction;

interface Tvremote{
	public void volume();
	public void batterycapacity();
}
interface Smarttvremote extends Tvremote{
	public void speed();
	public void voice();
}
class Tv implements Smarttvremote{

	@Override
	public void volume() {
		System.out.println("vol");
		
	}

	@Override
	public void batterycapacity() {
		System.out.println("bat");		
	}

	@Override
	public void speed() {
		System.out.println("speed");		
	}

	@Override
	public void voice() {
		System.out.println("voice");		
	}
}
public class Tvprgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Tv ob=new Tv();
ob.batterycapacity();
ob.voice();
ob.volume();
ob.speed();
	}

}
