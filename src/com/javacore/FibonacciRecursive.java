package com.javacore;

public class FibonacciRecursive {

	public static void main(String[] args) {
		//Fibonacci Series is defined by the sum of previous 2 fibonacci numbers
		//Xn = Xn-1 + Xn-2;
		/*
		 fibo(0) = 0
		 fibo(1) = 1
		 fibo(2) = fibo(1) + fibo(0) = 0 + 1 = 1
		 fibo(3) = fibo(2) + fibo(1) = 1 + 1 = 2
		 fibo(4) = fibo(3) + fibo(2) = 2 + 1 = 3
		 fibo(5) = fibo(4) + fibo(3) = 3 + 2 = 5
		 fibo(6) = fibo(5) + fibo(4) = 5 + 3 = 8
		 */
		int n = 10;
		for (int i=0; i<=n; i++)
		System.out.println("X(" + i + ") = " + fib(i));
		
	}
	
	public static int fib(int n) {
		
		if ((n == 0) || (n == 1)) {
			return n;
		}else 
		
		return ( fib(n-1) + fib(n-2) );
	}
	

}
