import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class copyintoanotherarray {

	public static void main(String[] args) {
		try {			 
		       ArrayList<String> list1 = new ArrayList<>();
		       list1.add("A");
		       list1.add("B");
		       list1.add("C");
		       ArrayList<String> list2 = new ArrayList<>();
		       list2.add("1");
		       list2.add("2");
		       list2.add("3");
		       System.out.println("Before Copy");
		       System.out.println(list1);
		       System.out.println(list2);
		       Collections.copy(list2,list1);
		      
		       System.out.println("After Copy");
		       System.out.println(list1);
		       System.out.println(list2);	 
		    }		    
		    catch (Exception e) {
		 
		      System.out.println(e);
		    }
	}

}
