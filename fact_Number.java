import java.util.Scanner;

public class fact_Number {

	public static void main(String[] args) {
		
		      int i,num,fact = 1;
		      Scanner sc=new Scanner(System.in);
		      System.out.print("Enter Number :");
		      num=sc.nextInt();
		      
		      for(i=1;i<=num;i++) {
		          fact=fact*i;
		      }
		      System.out.println("Factorial Of Given Number : "+fact);

	}

}
