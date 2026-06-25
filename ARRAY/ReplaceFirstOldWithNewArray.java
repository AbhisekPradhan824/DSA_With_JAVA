/*
Program-13: Java program to Replace First Occurance of old element with a new element in an array
*/

import java.util.*;

public class	ReplaceFirstOldWithNewArray	 
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
	System.out.print("Enter the Old Element You Want to Replace: ");
	int old =scn.nextInt();
	System.out.print("Enter the New Value : ");
	int newv =scn.nextInt();
	System.out.println();
	
	for(int i =0; i<elem.length; i++){
		if(elem[i]==old){
			elem[i]=newv;
			break;
		}
	}
	
	
	//Print the New Array Elements
	System.out.println("Final elements of the Array is : ");
	System.out.print(" [ ");
	for(int i:elem){
		System.out.print(i+" ");
		}
	System.out.println(" ] ");
	}
}
