/*
Program-9: Java program to calculate sum of factorials of elements present in an array
*/

import java.util.*;

class Factorial{
static int factorial=1;
	public static int getFactorial(int num){
		if(num==0||num==1)
			return 1;
		return (int)num*getFactorial(num-1);
	}
}
public class	SumofFactorialElementArray	 
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
		int fact = Factorial.getFactorial(i);
		System.out.println("Factorial of "+i+ " = "+fact);
		sum+=fact;
		}
	System.out.println("Sum of elements = "+ sum);
	}
}
