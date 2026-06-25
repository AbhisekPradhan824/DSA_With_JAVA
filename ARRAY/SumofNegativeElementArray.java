/*
Program-6: Java Program to Calculate sum of Negative elements in an array
*/

import java.util.*;
public class	SumofNegativeElementArray	 
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
	
	int sum=0;
	System.out.println("Negative Elements are : ");
	for(int i:elem){
		if(i<0){
			System.out.print(i+" ");
			sum+=i;
		}
	}
	System.out.println();
	System.out.println("Sum of Negative elements = "+ sum);
	}
}
