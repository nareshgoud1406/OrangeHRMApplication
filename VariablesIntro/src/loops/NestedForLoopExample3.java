package loops;

public class NestedForLoopExample3 {

	public static void main(String[] args) {
		
		for(int index1=5;index1>=0;index1--)
		{
		for(int index2=index1;index2>=0;index2--)
		{
		System.out.print(index2 +"  ");      
		}
		System.out.println();
		}
		System.out.println("##################### ");
		for(int index1=5;index1>=1;index1--)
		{
		for(int index2=1;index2<index1;index2++)
		{
		System.out.print(index1 +"  ");      
		}
		System.out.println();
		}
		
		
		
		
		
		
		
		
		
		

	}

}
