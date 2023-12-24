import java.util.Scanner;

class MinimumAccountBalance extends Exception {

	    String message;

	    public MinimumAccountBalance(String message) {
	        this.message = message;
	    }

	    public String toString() {
	        return message;
	    }
	}

	public class exceptionamount {

	    static double Account_balance = 2000;

	    public static void main(String[] args) throws MinimumAccountBalance {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter amount to withdrawal");
	        int n = sc.nextInt();
	        try {
	            if (Account_balance < n) {
	                throw new MinimumAccountBalance("Sorry, Insufficient balance, you need more 500 Rs. To perform this Transaction " + Account_balance);
	            } else {
	                System.out.println("Please Take The Money : " + n);
	            }

	        } catch (MinimumAccountBalance mab) {
	            mab.printStackTrace();
	        }
	    }

}
