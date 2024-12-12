package scnnprgm;
import java.util.Scanner;
public class Userpass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the number of rows");
				int r=sc.nextInt();
				sc.nextLine();
				String[] user=new String[r];
			    String[] pass=new String[r];
		System.out.println("Enter user name and pass");
		for(int i=0;i<r;i++)
		{
			user[i]=sc.nextLine();
			pass[i]=sc.nextLine();
			}
		System.out.println("Username"+" "+"Passwords");
		for(int i=0;i<r;i++)
		{
			System.out.println(user[i]+"\t"+pass[i]);
		}
		}
		}