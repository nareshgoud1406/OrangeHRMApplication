package userdefinedMethods;

public class Method_Example2 {

	// User defined Names should always be unique
	protected void subtraction()
	{
	int var1=20;
	int var2=10;
	int var3;

	var3=var1-var2;
	System.out.println(" The value of the varibale var3 after subtraction is :- "+var3);

	}

	public static void main(String[] args)
	{
	Method_Example2 m2 = new Method_Example2();
	m2.addition();
	m2.subtraction();
	m2.subtraction();
	m2.addition();

	}

	public void addition()
	{
	int var1=20;
	int var2=10;
	int var3;

	var3=var1+var2;
	System.out.println(" The value of the varibale var3 after Addition is :- "+var3);


	}

	}

	
	
	
	

