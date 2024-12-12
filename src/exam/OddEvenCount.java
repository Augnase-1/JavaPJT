package exam;
public class OddEvenCount {
public static void main(String[] args)
{
		        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		        System.out.print("Odd Numbers :");
		        for (int num : numbers) 
		        {
		            if (num % 2 != 0) {
		                System.out.print(num + " ");  
		            }
		        }
System.out.print("\nEven Numbers :");
for (int num : numbers) 
{
    if (num % 2 == 0)
    {
        System.out.print(num + " ");  
    }
}
}
}
