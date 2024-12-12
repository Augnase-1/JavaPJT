package tstng;

public class Operators {

	public static void main(String[] args) {
		
//arithmetic operators
	int a=40,b=30;
	System.out.println("a+b="+(a+b));
    System.out.println("a-b="+(a-b));
    System.out.println("a*b="+(a*b));
    System.out.println("a/b="+(a/b));      //quotient
    System.out.println("a%b="+(a%b));      //reminder
    
//Assignment operators 
    int c=a;       //40
    System.out.println("c="+c);
    System.out.println("a+=b="+(a+=b));   //a=a+b  40+30=70
    System.out.println("a-=b="+(a-=b));   //a=a-b  70-30=40
    
//Relational opereators
    System.out.println("a==b="+(a==b));
    System.out.println("a!=b="+(a!=b));
    System.out.println("a>b="+(a>b));
    System.out.println("a>=b"+(a>=b));
    System.out.println("a<b"+(a<b));
    System.out.println("a<=b"+(a<=b));
    
//Logical operators

//   A    B    A&&B   A||B    !A      !B
//   0    0     0      0       1	   1																																		`																							
//   0    1     0      1       0       1
//   0    1     0      1       1       0
//   1    1     1      1       0       0
    
    String username="abc";
    String password="abc123";
    System.out.println((username=="abc")&&(password=="abc123"));
    System.out.println((username=="cdc")||(password=="abc123"));
    System.out.println(!(username=="abc"));
    
//Unary operators
  //c1++post increment
  //++c1pre increment
    int c1=10,c2=21;
    System.out.println(c1++);
    System.out.println(c1);
    System.out.println(++c1);
  //c2--post decrement
  //--c2pre decrement
    System.out.println(c2--);
    System.out.println(c2);
    System.out.println(--c2);
    
//Ternary operators(/:)
    //syntax variable=condition?exp1:exp2
    String v=c2>c1?"c2 is larger":"c1 is larger";
    System.out.println(v);
     
    
	}

}
