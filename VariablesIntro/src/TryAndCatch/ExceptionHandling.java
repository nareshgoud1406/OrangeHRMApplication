package TryAndCatch;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		 int var1=10;
	      int var2=0;
	      int var3;
	     // var3=var1/var2;
	      //System.out.println("division is  "+var3);
	    
	//Exception in thread "main" java.lang.ArithmeticException: / by zero	
		
		try {
		     
			 var3=var1/var2;
		      System.out.println("division is  "+var3);
		    } 
		catch(Exception a)
		{
			System.out.println("Exception........ ");
		}
		
		
		
		
	}

}


//Try and catch is used ro catch the arirhmatic exception here