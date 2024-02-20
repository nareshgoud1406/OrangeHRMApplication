package com.Arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
				
		/*
		  ArrayList:- Collections of Java
		 Its a dynamic data structure
		Syntax:
		 List<dataType>arrayListName = new ArrayList<>();

		*/

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
		System.out.println("###########################################");
		
		//$$$$$$$$$$$$$$$$$$$$$ USING NESTED FOR LOOP $$$$$$$$$$$$$$$$$$$$$$$$
		
		for(int index=0;index<arrayList1.size();index++)
		{
		System.out.println(arrayList1.get(index));  //arrayname.get() method is used 
		}
		
	}

}


// arrayname.add() method is to Assign the values to Arrays 

//arrayname.get() method is to call the values of index

