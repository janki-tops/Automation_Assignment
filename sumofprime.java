
public class sumofprime {

	public static void main(String[] args) {
		int i, num, count, sum = 0; 
				
				for(num = 1; num <= 100; num++)
				{
					count = 0;
				    for (i = 2; i <= num/2; i++)
				    {
				    	if(num % i == 0)
				    	{
				    		count++;
				    		break;
				    	}
				    }
				    if(count == 0 && num != 1 )
				    {
				    	sum = sum + num;
				    }  
				}
		                System.out.println("The Sum of Prime Numbers from 1 to 100 = " + sum);
				}
}
