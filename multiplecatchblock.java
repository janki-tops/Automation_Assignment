
public class multiplecatchblock {

	public static void main(String[] args) {
		try{    
            int a[]=new int[5];    
            a[5]=30/0;    
           }    
           catch(ArithmeticException e)  
              {  
               System.out.println("Arithmetic Exception occurs" +e);  
              }    
           catch(ArrayIndexOutOfBoundsException a)  
              {  
               System.out.println("ArrayIndexOutOfBounds Exception occurs" +a);  
              }    
           catch(Exception c)  
              {  
               System.out.println("Parent Exception occurs" +c);  
              }             
           System.out.println("rest of the code");    

	}

}
