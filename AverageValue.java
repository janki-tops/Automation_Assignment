import java.util.Scanner;

public class AverageValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
        System.out.println("Enter array Elements: ");
        int num = sc.nextInt();
        int[] array = new int[num];
        System.out.println("Enter array values :  ");
        for (int i = 0; i < num; i++) {
            int value = sc.nextInt();
            array[i] = value; 
        }
         int length = array.length;
         int sum = 0;
         for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
         double average = sum / length;
         System.out.println("Average of array : " + average);
 
	}

}
