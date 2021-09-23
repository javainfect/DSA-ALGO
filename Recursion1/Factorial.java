package Recursion1;

import java.util.Scanner;

public class Factorial {

	public static int fact(int n) {
		
		if(n<=0) {
			return 1;
		}
		int f = n*fact(n-1);  //Function  (fact)calling itself
		return f;
	}
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number to calculate Factorial :");
		int n = sc.nextInt();
		System.out.println("Factorial of "+n+" :"+fact(n));
	}
	
}
