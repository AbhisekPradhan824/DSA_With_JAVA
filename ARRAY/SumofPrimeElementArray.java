/*
Program-8: Java program to calculate sum of prime elements present in an array
*/

import java.util.*;

class Prime
{
	public static boolean isPrime(int num){
		for(int i=2; i<=num/2; i++){
			if(num%i==0){
				return false;
			}
		}
		return true;
	}
}
public class	SumofPrimeElementArray	 
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
	System.out.println("Prime Elements are: ");
	for(int i:elem){
		if(Prime.isPrime(i) ){
			System.out.print(i+" ");
			sum+=i;
		}
	}
	System.out.println();
	System.out.println("Sum of elements = "+ sum);
	}
}
