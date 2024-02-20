package strings;

public class StringsExample3 {

	public static void main(String[] args) {
		String var1="PardhuIsATopper";
		String var2="PardhuIsNotATopper";
		
		int var1Length=var1.length();  // we are finding length of variables of string type
									   // that length is stored in a variable of "int" type   	
		int var2Length=var2.length();
		System.out.println("var1 variable lenght is "+var1Length);
		System.out.println("var2 variable lenght is "+var2Length);
		
		if(var1Length>var2Length)
		{
			System.out.println("var1 is variable value lenght is bigger/greater than var2 variable value");
		}
		else
		{
			System.out.println("var1 is variable value lenght is smaller/lesser than var2 variable value");
		}
				

	}

}
