/*
Java Program to Store and Retrieve Element in/From an Array
*/

import java.util.*;
public class		ArrayPractice1	 
{
	public static void main(String[] args) 
	{
		Scanner scn =new Scanner(System.in);
		System.out.println("Enter the Number of Elements");
		int num = scn.nextInt();
		int[] elem = new int[num];
		for(int i = 0; i<elem.length; i++){
			System.out.println("Enter "+ (i+1) + " Element..");
			elem[i]=scn.nextInt();
	}
	
	for(int i:elem){
		System.out.print(i+"\t");
	}
	System.out.println();
	}
}
