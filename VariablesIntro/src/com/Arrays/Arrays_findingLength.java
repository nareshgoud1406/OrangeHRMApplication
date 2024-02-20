package com.Arrays;

public class Arrays_findingLength {

	public static void main(String[] args) {
		
	
		int array[]=new int[3];
		array[0]=12;
		array[1]=10;
		array[2]=20;
		
		for(int index=0;index<array.length;index++) //Finding Length of an Array
		{
			
		System.out.println(array[index]);	
			
		}
		
		String array1[][]=new String[2][2];
		array1[0][0]="Salaar";
		array1[0][1]="Bahubali";
		array1[1][0]="Hanuman";
		array1[1][1]="Bahubali-2";
		
		for(int rowindex=0;rowindex<array1.length;rowindex++)
		{
		
			for(int rowofCell=0;rowofCell<array1.length;rowofCell++)
			{
				System.out.println(array1[rowindex][rowofCell]);
			}
		}
	
	}
}
	
	

