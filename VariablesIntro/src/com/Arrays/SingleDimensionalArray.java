package com.Arrays;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		
		
	int array[]=new int[4];	//creating a Single Dimensional Array
							//Syntax:- DataType VariableName[] = new data type [size]
	
		
		array[0]=20;     //Assigning Variable[index Number]=value 
		array[1]=30;	//index[0]=20;
		array[2]=40;
		array[3]=50;
		
		//System.out.println(array[0]);
		
		for(int index=0;index<=3;index++)
		{
			System.out.println(array[index]);
		}
		
		
		

		
		
//		The Size of the Array should be declared and it is fixed
//
//		Array can save only similar dataType Values
//
//		Index of an array always starts with 0(zero).
//
//		If the size of an array created and if we are not assigning any value into an index of an Array then it will store default values of that  DataType
//
//		Once the size of an array is created and if we try to insert an extra value into the array - it will not accept more than the size declared



	}

}
