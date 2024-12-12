package iterativestatement;

import java.util.Scanner;

public class Prgm {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in the array:");
		int n=sc.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
            int largest = ar[0];
            for (int j = 1; i < n; i++) {
                if (ar[i] > largest) {
                    largest = ar[i];
                }
            }
            System.out.println("The largest element in the array is: " + largest);
        }
        }        
}

	


