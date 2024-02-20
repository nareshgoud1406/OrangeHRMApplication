package loops;

public class DoWhileLoopExample1 {

	public static void main(String[] args) {
		
		int var=2;	  //Initialization
		do
		{
		System.out.println("seleniumm"+"---"+ var);//First it will print Selenium--2 anyway
												   //next it will Increment variable value by 1
		var++;									   //next it will check for condition
												   //After checking condition it will go to do loop
			
		}
		
		while(var<=8);  //Condition
		
		System.out.println(var);				 //if condition is false it will print only one 
													// selenium--2 and stores var value as 3
	}

}
