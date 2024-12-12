package stringg;

import java.util.Scanner;

public class Strpali {

	public static void main(String[] args) {
		//  string palindrome
		
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.next();
        String rev="";
        for (int i=s.length()-1;i>=0;i--)
        {
        	rev=rev+s.charAt(i);
        	
        }
    	if(rev.equalsIgnoreCase(s))
    	{
    		System.out.println("Entered string is a palindrome.");
    	}
    	else
    	{
            System.out.println("Entered string is not a palindrome.");
    	}
	}
}



        
       
        
        
        
        
        
      


