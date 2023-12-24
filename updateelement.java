import java.util.ArrayList;

public class updateelement {

	public static void main(String[] args) {
		try {			 
		       ArrayList<String> list = new ArrayList<>();
		       list.add("A");
		       list.add("B");
		       list.add("C");
		       list.add("D");
		       System.out.println("Before update");
		       System.out.println(list);
		       list.set(2, "E");
		       System.out.println("After update");
		       System.out.println(list);		 
		    }		    
		    catch (Exception e) {
		 
		      System.out.println(e);
		    }
	}

}
