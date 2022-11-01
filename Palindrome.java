/*
WAP to check a given number is palindrome or not. ( If reverse of a number and number is 
same, then it is called palindrome*/



import java.util.Scanner;

class Palindrome{
	
	public static void main(String[]args){
		System.out.print("enter the number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int reminder;
		int temp=n;
		
		while(n>0){
			reminder=n%10;
			sum=(sum*10)+reminder;
			n=n/10;
			
		}
		if(temp==sum){
			System.out.println("palindrome number:");
		}
		else
			System.out.println("not palindrome number:");
		
		
		
		
		
	}
	
}