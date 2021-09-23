package Recursion1;

import java.util.Scanner;

public class CalculatePower {

	public static int power(int x, int n) {
		
		if (n==0) {
			return 1;
		}
		int p = x * power( x, n-1);
		return p;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number :");
		int x = sc.nextInt();
		System.out.print("Enter the power of number :");
		int n = sc.nextInt();
		System.out.println(x+" raised to the power "+n+" ="+power(x,n));
		
	}

}
