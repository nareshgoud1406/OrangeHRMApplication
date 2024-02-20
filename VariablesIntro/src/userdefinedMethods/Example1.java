package userdefinedMethods;

public class Example1 {
	
	
	public static void main(String[] args)
	{
	
	Example1 m1 = new Example1(); // creating an object to the Current Class

	m1.srini();					  // using the Objected created - calling the User Defined Method
	

	System.out.println();
	m1.srini();

	System.out.println();
	m1.srini();

	}


	public void srini()
	{
	System.out.println(" This is my User Defined Method ");
	}


	}

	//User defined Method
	// User defined method in a  Java Class will not be executed by itself
	// To perform the Operations in a Java Class - mandatory the Class should have a Main Method

	// User defined methods should never be written with in the main Method - should be always be
	// written outside the main method only

	// user defined methods can be written either above the Main method of below the main method

	// User defined methods are created Once - can be utilized for any number of times based on
	// our need - User defined methods are created for ***ReUsability purpose
	
		
		
		
		
		
		
	


