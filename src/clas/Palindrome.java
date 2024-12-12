package clas;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
	
		        Scanner sc=new Scanner(System.in);
		        System.out.println("Enter a number:");
		        int x=sc.nextInt();
		        int temp=x,rev=0;
		        while(x>0)
		        {
		        	int rem=x%10;
		        	rev=rev*10+rem;
		        	x=x/10;
		        }
		        if(temp==rev)
		        {
		            System.out.println(temp +" is a palindrome.");
		        }
		        else
		        {
		            System.out.println(temp +" is not a palindrome.");

		        }
	}
}

		        

	
