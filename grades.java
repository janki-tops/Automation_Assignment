import java.util.Scanner;

public class grades {
	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		System.out.print(" Please Enter the Marks : ");
		int ma = sc.nextInt();			
		sGrade(ma);	
	}
	public static void sGrade(int ma)
	{
		  
		
		if(ma >= 91 && ma<=100 )
	    {
			System.out.println("\n Grade AA");
		}
		else if(ma >= 81 && ma<=90)
	    {
			System.out.println("\n Grade AB");
		}
		else if(ma >= 71 && ma<=80)
	    {
			System.out.println("\n Grade BB");
		}
		else if(ma >=61 && ma<=70)
	    {
			System.out.println("\n Grade BC");
		}
		else if(ma >=51 && ma<=60)
	    {
			System.out.println("\n Grade CD");
		}
		else if(ma >=41 && ma<=50)
	    {
			System.out.println("\n Grade DD");
		}
		
		else 
	    {
			System.out.println("\n Fail");
		} 
	}


}
