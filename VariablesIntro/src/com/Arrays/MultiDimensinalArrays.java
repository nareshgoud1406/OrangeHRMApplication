package com.Arrays;

public class MultiDimensinalArrays {

	public static void main(String[] args)
	{
		
	int array[][]=new int[2][2];
	
	array[0][0]=10;
	array[0][1]=20;
	array[1][0]=30;
	array[1][1]=40;
			
	for(int rowIndex=0;rowIndex<=1;rowIndex++)
	{
		for(int rowOfCell=0;rowOfCell<=1;rowOfCell++)
		{
		System.out.print(array[rowIndex][rowOfCell]+"   ");
		}
		System.out.println();
	}
		
	String array1[][]=new String [2][2];
	
	array1[0][0]="VenkatSir";
	array1[0][1]="Java";
	array1[1][0]="Selenium";
	array1[1][1]="JDK";

	
	for(int rowIndex=0;rowIndex<=1;rowIndex++)
	{
		for(int rowOfCell=0; rowOfCell<=1;rowOfCell++)
		{
			//System.out.println(array1[rowIndex][rowIndex]);
			//System.out.println(array1[rowOfCell][rowOfCell]);
			System.out.println(array1[rowIndex][rowOfCell]);
		}
	}
	

	
	}

}
