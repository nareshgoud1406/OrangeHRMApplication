package userdefinedMethods;

public class Method_Example3 {
	 	// private User defined method can be only be accessed within
		// the same Class - can be called for any number of times
		// *** private User defined methods cannot be accessed in any other different classes


private void multiplication()	{
int var1=20;
int var2=10;
int var3;

var3=var1*var2;
System.out.println(" The value of the varibale var3 after Multiplication is :- "+var3);

}

public static void main(String[] args) {


Method_Example3 m3 = new Method_Example3();
m3.multiplication();

m3.multiplication();

Method_Example2 hi = new Method_Example2();
hi.subtraction();


}

}
	
	
	
