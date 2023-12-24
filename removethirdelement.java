import java.util.ArrayList;

public class removethirdelement {

	public static void main(String[] args) {
		try {			 
		       ArrayList<String> list = new ArrayList<>();
		       list.add("A");
		       list.add("B");
		       list.add("C");
		       list.add("D");
		       list.add("E");
		       list.add("F");
		       list.add("G");
		       list.add("H");
		       
		       System.out.println("Before Remove");
		       System.out.println(list);
		       list.remove(2);
		       System.out.println("After Remove");
		       System.out.println(list);		 
		    }		    
		    catch (Exception e) {
		 
		      System.out.println(e);
		    }

	}

}
