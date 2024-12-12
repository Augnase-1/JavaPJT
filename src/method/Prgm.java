package method;

import java.util.Scanner;

public class Prgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prgm ob=new Prgm();
		ob.area();
	    ob.square(5);
		ob.tri();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius");
        ob.circle(sc.nextInt());
	}
// area of rectangle
public void  area(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the length: ");
int l=sc.nextInt();
System.out.println("Enter the breadth: ");
int b=sc.nextInt();
int ar=l*b;
System.out.println("Area of rectangle:" +ar);
		}
//area of square
	public void square(int a) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Area of square: ");
		int c=a*a;
		System.out.println(c);
	}
	
//area of triangle
    public double tri()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length: ");
		int b=sc.nextInt();
		System.out.println("Enter the breadth: ");
	    int h=sc.nextInt();
		int arr=b*h/2;
		System.out.println("Area of triangle:" +arr);
		return arr;
	}

//circle

public void circle(int r)
{
 double aoc=3.14*r*r;
System.out.println("Area of circle: " +aoc);

}
}