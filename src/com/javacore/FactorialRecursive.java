package com.javacore;

public class FactorialRecursive {

	public static void main(String[] args) {
		// Factorial of a number is a product of that number and factorial of number before the number
		/*
		 * N! = N x (N - 1)!
		 * 0! = 1
		 * 1! = 1
		 * 2! = 2 * 1! = 2 * 1 = 2
		 * 3! = 3 * 2! = 3 * 2 = 6
		 * 4! = 4 * 3! = 4 * 6 = 24
		 * 5! = 5 * 4! = 5 * 24 = 120
		 * 
		 */
		int n = 20;
		for (int i=0; i<=n; i++) {
			System.out.println(i + "! = " + facto(i));
		}

	}
	
	public static long facto(int n) {
		if (n==0)  {
			return 1;
		}else
			return n*facto(n-1);
	}

}
