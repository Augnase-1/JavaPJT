package polymorphism;
public class MethodOverloading {
	public static void main(String[] args) {
		MethodOverloading ob=new MethodOverloading();
		ob.add();
		ob.add(10, 5);
		ob.add(12, 10.5);
		ob.add(2.5, 20);
		ob.add(2.3, 4.6);
	}
public void add() {
	int a=20,b=10,c;
	c=a+b;
	System.out.println(c);
}
public void add(int a,int b) {
int c=a+b;
System.out.println(c);
}
public void add(int a,double b) {
double c=a+b;
System.out.println(c);
}
public void add(double a,int b) {
double c=a+b;
System.out.println(c);
}
public void add(double a,double b) {
double c=a+b;
System.out.println(c);
} 
}