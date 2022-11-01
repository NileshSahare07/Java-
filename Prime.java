/*
WAP to check a given number is prime number or not. */

import java.util.Scanner;

class Prime{
	public static void main(String[]args){
		
		System.out.print("enter the number:");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int i; 
		boolean flag=false;
		if(n==0||n==1)
			flag =true;
		for (i=2; i<=n/2; i++)
		{
			if(n % i ==0){
				flag = true; 
				break;
			}
		}
		if(flag== true){
			System.out.print(" not a prime number:"+n);
		}else
			System.out.print(" prime number:"+n);
	}
}
		
		
		
		