package coditions;

public class NestedIF 
{

	public static void main(String[] args) 
	{
		
	int var1=200;
	int var2=100;
	int var3=100;

		if(var1>var2)
		{
			System.out.println("Pardhu");
			
				if(var2==var3)//Nested if - if followed by the if 
				{
					System.out.println("is a good boy");
				}
		}
		
	}
				// it will print both the statements bcz both conditions are true 
}
