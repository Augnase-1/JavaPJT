package iterativestatement;

public class Prblmwhile {

	public static void main(String[] args) {
		int n = 876;  
        int rem;
        int rev=0;
      
        while (n>0)
        {
        rem=n%10;         //876%10=6    //87%10=7     //8%10=8
        rev=rev*10+rem;  //0*10+6=6    //6*10+7=67   //67*10+8=678
        n=n/10;         //876/10=87   //87/10=8     //8/10=0
        		
        }	
        System.out.println(rev);
    }
}	


//reverse a number