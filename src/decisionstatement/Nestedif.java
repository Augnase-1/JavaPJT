package decisionstatement;

public class Nestedif {

	public static void main(String[] args) {
		int a=55;
		if(a%5==0)
		{
		if(a%11==0)
		
		{
			System.out.println("55 is divisible by 5 and 11");
		}
		else
		{
			System.out.println("55 is not divisible by 11 but divisible by 5");
		}
		}
		else
		{
			System.out.println("55 is not divisible by 5 and  11");
		}
	}
}
