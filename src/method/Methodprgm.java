package method;
public class Methodprgm {
	public static void main(String[] args) {
		// method
		Methodprgm ob=new Methodprgm();
		ob.add();
		System.out.println(ob.sub());
        ob.mul(5, 10);
		System.out.println(ob.div(50, 10));
	}
//method without returntype and without parameters add()
	
	public void add()
	{
		int a=20, b=10,c;
		c=a+b;
		System.out.println(c);
	}
	
	//method with returntype and without parameters sub()
	public int sub()
	{
		int a=20, b=10,c;
		c=a-b;
		return c;
	}
	
	//method without returntype and with parameters sub()
	
	public void mul(int a,int b)
	{	
		int c=a*b;
		System.out.println(c);
	}
	
	//method with returntype and with parameters div()
	
	public double div(int a, int b)
	{
		double d=a/b;
		return d;
	}
	}

