package strings;

public class StringExample5 {

	public static void main(String[] args) {
		String var1="JavaProgramming";
		String var2="Programming";
		String var3="Java";

		System.out.println("var1 is= "+var1);
		System.out.println("var2 is= "+var2);
		System.out.println("var3 is= "+var3);
		if(var1.contains(var2))
		{
			System.out.println("var1 contains var2 ");
		}
		else
		{
			System.out.println("var1 contains var2 ");
		}
		if(var1.contains(var3))//method is used to find the existence of specified sequence of chars 
														
		{
			System.out.println("var1 contains var3");
					
		}
		else
		{
			System.out.println("var1 doesn't contains var3");
		}
		
	}
	
	

}
