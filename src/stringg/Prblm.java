package stringg;

import java.util.Scanner;

public class Prblm 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
                String st=sc.nextLine();
                String [] split=st.split(" ");
                for (String e:split)
                {
                	if(e.length()%2==0)
                	{
                		System.out.print(e+" ");
                	}
               
                }              
        }
}


	


