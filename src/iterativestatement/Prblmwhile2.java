package iterativestatement;

public class Prblmwhile2{

	public static void main(String[] args) 
	{
//count
		int num=5876;
		int count=0;
        while(num>0)
        {
	     num=num/10;    //5876/10=587   //587/10=58    //58/10=5   //5/10=0  
	     count++;

        }
        System.out.println(" no. of digits= " + count);
	 }

  }