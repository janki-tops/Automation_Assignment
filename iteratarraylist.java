import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class iteratarraylist {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3,4, 5, 6, 7, 8);
		for (int i = 0; i < numbers.size(); i++) 
			System.out.print(numbers.get(i) + " ");   
	}

}
