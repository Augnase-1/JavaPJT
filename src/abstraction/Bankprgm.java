package abstraction;

import java.util.Scanner;

interface Bank{
public void  accountdetails();
public void withdraw();
public void deposit();
}
class Sbi implements Bank{
int balance=50000;
int withdraw;
int deposit;
static String bankname="SBI";
Scanner sc=new Scanner(System.in);

@Override
	public void accountdetails() {
        System.out.print("Enter your account number:");
		int acc=sc.nextInt();
		System.out.println("Account number:"+acc);
        System.out.print("Enter your name:");
		String name=sc.next();
		System.out.println("Name:"+name);
		System.out.println("Balance:"+balance);
	}

	@Override
	public void withdraw() {
		System.out.print("Enter the amount for withdrawl:");
        int withdraw=sc.nextInt();
        balance=balance-withdraw;
        System.out.println("current balance:"+balance);	
	}

	@Override
	public void deposit() {
		System.out.print("Enter deposit amount:");
		int deposit=sc.nextInt();
		balance=balance+deposit;
		System.out.println("current balance:"+balance);
	}
	

}
public class Bankprgm {

	public static void main(String[] args) {
Sbi ob=new Sbi();
ob.accountdetails();
ob.withdraw();
ob.deposit();
	}

}

