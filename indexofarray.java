
public class indexofarray {

	public static int findIndex(int[] array, int num) {
	      for (int i = 0; i < array.length; i++) {
	         if (array[i] == num) {
	            return i;
	         }
	      }
	      return -1;
	   }
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5};
	      int num = 4;
	      int index = findIndex(array, num);
	      System.out.println("Index of element " + num + ": " + index);
	}
}
