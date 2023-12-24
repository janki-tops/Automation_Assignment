import java.util.Scanner;

public class Greatest_Number {
	public static void main(String[] args) {

	      int a, b,c;
	      Scanner sc=new Scanner(System.in);
	      System.out.println("Enter Number 1:");
	      a=sc.nextInt();
	      System.out.println("Enter Number 2:");
	      b=sc.nextInt();
	      System.out.println("Enter Number 3:");
	      c=sc.nextInt();
	      if( a >= b ) {
	          System.out.println(a+" is the largest Number");
	      }
	      else if (b >= c)
	      {
	          System.out.println(c+" is the largest Number");
	      }
	      else
	      {
	      System.out.println(c+" is the largest Number");
	      }
	}
}
