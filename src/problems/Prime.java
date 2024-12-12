package problems;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// Prime

		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter a positive integer: ");
		        int num = sc.nextInt();
		        if (num <= 1) {
		            System.out.println(num + " is not a prime number.");
		        } else {
		            boolean isPrime = true;
		            for (int i = 2; i < num; i++) {
		                if (num % i == 0) {
		                    isPrime = false;
		                    break;
		                }
		            }
		            if (isPrime) {
		                System.out.println(num + " is a prime number.");
		            } else {
		                System.out.println(num + " is not a prime number.");
		            }
		        }	
	}
}
