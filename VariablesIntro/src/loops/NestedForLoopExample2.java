package loops;

public class NestedForLoopExample2 {

	public static void main(String[] args) {
		
		for(int a=0;a<2;a++) // Outer Loop
		{
		for(int b=1;b<=2;b++) // Inner Loop
		{
		System.out.println(a+b);
		}
		}	
		System.out.println(" ##################### ");
		
		for(int a=0;a<2;a++) // Outer Loop
		{
		for(int b=1;b<=2;b++) // Inner Loop
		{
		System.out.println(" Testing ");
		}
		System.out.println();
		}
		for(int a=0;a<2;a++) // Outer Loop
		{
		for(int b=1;b<=2;b++) // Inner Loop
		{
		System.out.print(" * ");
		}
		System.out.println();
		}
		
		
		

	}

}
