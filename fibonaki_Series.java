import java.util.Scanner;

public class fibonaki_Series {
	public static void main(String[] args) {

	int i ,num1 = 0, num2 = 1,num3=0,n=0;
	;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the Number :");
    n=sc.nextInt();
	for (i = 1; i <= n; ++i) {
      System.out.print(num1 + ", ");

      // compute the next term
      num3 = num1 + num2;
      num1 = num2;
      num2 = num3;
    }
}
}
