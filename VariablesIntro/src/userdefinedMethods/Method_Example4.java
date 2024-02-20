package userdefinedMethods;

public class Method_Example4 {

	private void division1()
	{
	int var1=20;
	int var2=0;
	int var3;

	var3=var1/var2;
	System.out.println(" The value of the varibale var3 after Division is :- "+var3);

	}

	public static void main(String[] args) {

	Method_Example4 m4 = new Method_Example4();
	System.out.println(" ******* Method of MethodExmaple4 Class ******* ");
	m4.division1();

	System.out.println();

	Method_Example2 hello = new Method_Example2();
	System.out.println(" ******* Methods of MethodExmaple2 Class ******* ");
	hello.addition();
	hello.subtraction();

	System.out.println();

	hello.addition();
	hello.subtraction();

	//Method_Example3 laddu = new Method_Example3();

	m4.division2();			//this method gives you Arithmetic Exception

	}

	void division2()
	{
	int var1=20;
	int var2=10;
	int var3;

	var3=var1/var2;
	System.out.println(" The value of the varibale var3 after Division is :- "+var3);

	}




























}
