/*
Program-4: Java Program to Calculate sum of odd elements in an array
*/

import java.util.*;
public class	SumofOddElementArray	 
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
	System.out.println("Odd Elements are : ");
	for(int i:elem){
		if(i%2!=0){
			System.out.print(i+" ");
			sum+=i;
		}
	}
	System.out.println();
	System.out.println("Sum of odd elements = "+ sum);
	}
}
