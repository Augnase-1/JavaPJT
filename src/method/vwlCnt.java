package method;
import java.util.Scanner;
public class vwlCnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a word: ");
        String s = sc.nextLine();
         vwlCnt ob=new vwlCnt();
        int count=ob.vwlCnt(s);
        System.out.println("no. of vowels=" +count);
	}
public int vwlCnt(String s)
{
	int count=0;
	for(int i=0;i<s.length();i++)
	{
		if (s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
	{
			count++;
			
	}
	}
	return count;
	}	
}

