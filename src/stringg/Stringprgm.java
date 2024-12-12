package stringg;

public class Stringprgm {

	public static void main(String[] args) {
		// STRING METHODS
	
		
		
String s="Hello";
String s1="July batch";
System.out.println(s.concat(s1));//Hellojuly batch

System.out.println(s+s1);//Hellojuly batch
System.out.println(2+3+s+5+6);//5Hello56



//equals
System.out.println(s.equals(s1));
System.out.println(s.equalsIgnoreCase(s1));
System.out.println(s.equals(s1));



//to upper and lower
System.out.println(s.toUpperCase());
System.out.println(s1.toUpperCase());
System.out.println(s1.toLowerCase());



//length
System.out.println(s1.length());



//startswith and ends with
System.out.println(s1.startsWith("July"));
System.out.println(s1.endsWith("batch"));



//contains
System.out.println(s1.contains("batch"));



//trim
String s3="   welcom   ";
String s4=s+s3;
System.out.println(s4);
String s5=s3.trim();
System.out.println(s+s5);



//replace
String s6="God is Great";
System.out.println(s6.replace("Great", "Love"));



//substring
System.out.println(s6.substring(7));
System.out.println(s6.substring(0, 3));



//split
String s7="Hello luminar te4chnolab";
String[] st=s7.split(" ");
for(String e:st)
{
	System.out.println(e);
	}



//to char array
	String s8="HELLO";
	char[] c=s8.toCharArray();
for(char ele:c)
	{
		System.out.println(ele);
	}

}
}
