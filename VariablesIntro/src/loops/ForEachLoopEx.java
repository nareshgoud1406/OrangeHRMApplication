package loops;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoopEx {

	public static void main(String[] args) {
	
		List<Object>arrayList1 = new ArrayList<>();

		arrayList1.add(10);
		arrayList1.add("Selenium");
		arrayList1.add('A');
		arrayList1.add(10.123);
		arrayList1.add(true);
		arrayList1.add("hello");
		
		//$$$$$$$$$$$$$$$$$$$$$ USING FOREACH LOOP TO PRINT $$$$$$$$$$$$$$$$$
		
		for(Object index:arrayList1)
		{
			System.out.println(index);
		}
		
	}

}

// we can use for each loop for Arrays 