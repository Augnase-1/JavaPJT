package decisionstatement;

public class Elseif {

	public static void main(String[] args) {
		int a=2,b=4,c=6;	
		if(a>b && a>c) 
		{
		System.out.println("a is greater");
	}
	else if(b>a && b>c) {
		System.out.println("b is greater");
	}
	else
	{
		System.out.println("c is greater");
	}
	
}
}
