package Recursion1;

import java.util.Scanner;

public class SumOfNaturalNum {
	
	public static int sum(int n) {
		if (n==1) {
			return 1;
		}
		return n+sum(n-1);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number :");
		int n = sc.nextInt();
		System.out.println("Sum of "+n+" Natural number is :"+ sum(n));
}
}
