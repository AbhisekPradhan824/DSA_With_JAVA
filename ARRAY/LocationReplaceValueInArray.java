/*
Program-16: Java program to replace given location with new element
*/

import java.util.*;

public class	LocationReplaceValueInArray	 
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
	
	//Print the Existing Array Elements
	System.out.println("Initial elements of the Array is : ");
	System.out.print(" [ ");
	for(int i:elem){
		System.out.print(i+" ");
		}
	System.out.println(" ] ");
	
	//Code for Replacing Old element with the new One
	System.out.print("Enter the Index Value : ");
	int index =scn.nextInt();
	System.out.println();
	
	
	if(index<0 || index>elem.length-1){
		System.out.println("ArrayIndexOutOfBound Exception please Enter a valid value of index ");
	}else{
			System.out.print("Enter the Element Value : ");
			int value =scn.nextInt();
			elem[index]=value;
			System.out.println();
			//Print the New Array Elements
			System.out.println("Final elements of the Array is : ");
			System.out.print(" [ ");
			for(int i:elem){
				System.out.print(i+" ");
				}
			System.out.println(" ] ");
	}
	
	
	}
}
