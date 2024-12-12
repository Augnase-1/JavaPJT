package scnnprgm;
import java.util.Scanner;
public class Prblm {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr=new int[3];
System.out.println("Enter the numbers");
Scanner sc=new Scanner(System.in);

for (int i=0;i<=2;i++)
{	
arr[i]=sc.nextInt();
}
System.out.println("Entered numbers are");
for(int i=0;i<=2;i++) {
	System.out.println(arr[i]);
	}

}
}