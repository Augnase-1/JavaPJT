package problems;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter first number : ");
				int n1=sc.nextInt();
				
				System.out.println("Select operation");
				char op=sc.next().charAt(0);
				
				System.out.println("Enter second number : ");
				int n2=sc.nextInt();
				int result;
				switch(op)
				{
				case '+':result=n1+n2;
				break;
				case '-':result=n1-n2;
				break;
				case '*':result=n1*n2;
				break;
				case '/':result=n1/n2;
				break;
				default:System.out.println("syntax error");
				return;
				}
				System.out.println(result);
			}
		}
	
