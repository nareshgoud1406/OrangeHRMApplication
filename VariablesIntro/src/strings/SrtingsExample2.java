package strings;

public class SrtingsExample2 {

	public static void main(String[] args)
	{
	
		String var1="PardhuTopper";		
		String var2="Pardhutopper";		
		System.out.println(var1);
		System.out.println(var2);
		
		if (var1.equalsIgnoreCase(var2))   //Comparing Strings Using equalsIgnoreCase
										  // it ignores case sensitivity
		{
			System.out.println("Var1 variable value is EQUAL to var2 variable value ");
			
		}
		else
		{
			System.out.println("Var1 variable value is NOT EQUAL to var2 variable value ");
		}
		
		
		
		
		
		

	}

}
