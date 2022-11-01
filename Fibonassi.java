/*
WAP to print Fibonacci series.
*/


import java.util.Scanner;
 
class Fibonassi {
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter 'N' value  : ");
		
		int n = Integer.parseInt(scan.nextLine());
		
		int a = -1;
		int b = 1;
		int c = 0;
		
		System.out.println("The Fibonacci Series are : ");
 
		for(int i=1; i<=n; i++) {
			
			c = a + b;
			int temp = a;
			a = b;
			b = c;
			
			System.out.print(c);
		}
	}
}