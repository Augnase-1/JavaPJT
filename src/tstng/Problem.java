package tstng;

public class Problem {

	public static void main(String[] args) {
	
//problem1
		int a=23,b=45;
	    System.out.println("a==b="+(a==b));

//problem2
        int A=55,B=70;
        System.out.println("A<B"+(A<B));
        System.out.println("A<50"+(A<50));
 
//problem3
       int a1=20,b1=30;
       System.out.println("value of a1 before swapping"+a1+"\n"+"value of b1 before swapping"+b1);
       a1=a1+b1;
       b1=a1-b1;
       a1=a1-b1;	
       System.out.println("value of a1 after swapping"+a1+"\n"+"value of b1 after swapping"+b1);

 //problem4
	   int X=17;
	   System.out.println("X%10="+(X%10));     
     

	}

}
