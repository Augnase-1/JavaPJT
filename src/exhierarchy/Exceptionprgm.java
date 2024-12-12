package exhierarchy;

public class Exceptionprgm {
	public static void main(String[] args) {		
try
    {
        int c=5/0;
        System.out.println(c);
    }
catch(Exception e)
 {
		System.out.println(e.getMessage());
 }
        System.out.println("hi hello");
try
{
	String s=null;
	System.out.println(s.length());
	}
catch(NullPointerException e1)
{
	System.out.println("error message");
	System.out.println(e1.getMessage());
}
try
{
	int[]arr=new int [2];
	arr[0]=1;
	arr[2]=2;
	arr[3]=3;
}
catch(Exception e2)
{
	System.out.println(e2.getMessage());
}
}
}


