package problems;
import java.util.Scanner;
public class CountPrblm {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int pcount = 0;
        int ncount = 0;
        int zerocount = 0;
        int no;
        System.out.print("Enter the numbers: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter a number: ");
            no = sc.nextInt();
            if (no > 0) {
                pcount++;
            } else if (no < 0) {
                ncount++;
            } else {
                zerocount++;
            }
        }
        System.out.println("Number of positive values: " + pcount);
        System.out.println("Number of negative values: " + ncount);
        System.out.println("Number of zero values: " + zerocount); 
    }
}


