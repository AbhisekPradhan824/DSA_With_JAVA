/*
Program 11: Java program to find the Min element present in an array
*/

import java.util.*;

public class	MinElementInArray	 
{
	public static void main(String[] args) 
	{
		Scanner scn =new Scanner(System.in);
		System.out.println("Enter the Number of Elements");
		int num = scn.nextInt();
		
		//Declaration of array
		int[] elem = new int[num];
		
		//Storing the values in an array
		for(int i = 0; i<elem.length; i++){
			System.out.println("Enter "+ (i+1) + " Element..");
			elem[i]=scn.nextInt();
	}
	
	//Print the Array Elements
	System.out.println("Elements are: ");
	System.out.print(" [ ");
	for(int i:elem){
		System.out.print(i+" ");
		}
	System.out.println(" ] ");
	
	//Finding Min element of that array
	int min = elem[0];
	for(int i=1; i<elem.length; i++){
		if (elem[i]<min)
		{
			min = elem[i];
		}
	}
	System.out.println("Min Number Present in this array is = "+ min);
	}
}
