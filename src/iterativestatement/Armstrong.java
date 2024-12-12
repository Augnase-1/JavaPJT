package iterativestatement;
public class Armstrong {
	public static void main(String[] args) {
		int num=153;
		int rem;
		int n=num;
		int arm=0;
		while (n>0) {
			rem=n%10;
			arm=arm+(rem*rem*rem);
			n=n/10;
			
		}
		if (arm==num) {
		System.out.println(num+" is an armstrong number");
		
	}else {
		System.out.println(num+" is not an armstrong number");
	}
}
}
	


 