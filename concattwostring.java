import java.util.Scanner;

public class concattwostring {

	public static void main(String[] args) {
		String str1, str2;
	      Scanner sc = new Scanner(System.in);
	      
	      System.out.println("Enter the First String: ");
	      str1 = sc.next();
	      System.out.println("Enter the Second String: ");
	      str2 = sc.next();
	      str1=str1.concat(str2);
	      System.out.println("\nConcated String :"+str1);
	}

}
