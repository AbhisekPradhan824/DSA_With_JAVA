/*
Program-2: Java Program to Calculate sum of elements in an array
*/

import java.util.*;
public class	SumofElementArrayPractice	 
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
	for(int i:elem){
		sum+=i;
	}
	System.out.println("Sum of even elements = "+ sum);
	}
}
