import java.util.Scanner;

public class comparisioninstring {

	public static void main(String[] args) {
		String str1, str2;
	      Scanner sc = new Scanner(System.in);
	      
	      System.out.println("Enter the First String: ");
	      str1 = sc.next();
	      System.out.println("Enter the Second String: ");
	      str2 = sc.next();
	      
	      if(str1.equals(str2))
	         System.out.println("\nBoth Strings are equal.");
	      else
	         System.out.println("\nBoth Strings are not equal.");
	}

}
