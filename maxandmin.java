
public class maxandmin {

	public static void main(String[] args) {
		int[] array = {50, 125, 978, 1856, 3564, 2146};
        int max = array[0]; 
        int min = array[0]; 
        for (int i = 0; i < array.length; i++) {
        	
        	System.out.println("Array List " +array[i]);
            if (array[i] > max) {
                max = array[i]; 
            }
            if (array[i] < min) {
                min = array[i]; 
            }
        }
        System.out.println("\n\nMaximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}
