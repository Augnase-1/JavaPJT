package scnnprgm;
import java.util.Scanner;
public class Multidm {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the number of rows: ");
	        int rows = sc.nextInt();
	        System.out.print("Enter the number of columns: ");
	        int cols = sc.nextInt();
	        int[][] numbers = new int[3][2];
	        System.out.println("Enter the elements of the 2D array:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                System.out.print("Element [" + i + "][" + j + "]: ");
	                numbers[i][j] = sc.nextInt();  
	            }
	        }
	        System.out.println("The elements of the 2D array are:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                System.out.print(numbers[i][j] + " ");
	            }
	            System.out.println();  
	        }   
	    }
	}

