package inheritance;
class Animal{
	public void animthd() {
		System.out.println("Animal Deatils");
	}
}

class Dog extends Animal{
	public void dogmthd() {
		System.out.println("Dog Details");
	}
}

class Elephant extends Animal{
	public void elemthd() {
		System.out.println("Elephant Details");
	}
}

public class HierachiaInheritance {

	public static void main(String[] args) {

Dog ob=new Dog();
Elephant obj=new Elephant();
ob.animthd();
ob.dogmthd();
obj.elemthd();
obj.animthd();
	}

}
