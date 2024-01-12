package test4;

import java.util.Scanner;

public class PrimeNumberChecking {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number to check it is prime or not");
		int input = sc.nextInt();

		boolean prime = isprime(input);
		
		if (prime) {
			System.out.println("the number is prime");
		} else {
			System.err.println("the number is not a prime");
		}

	}

	private static boolean isprime(int a) {

		if (a <= 1) {
			return false;
		} else if (a > 1) {
			for (int i = 2; i < a; i++) {
				if (a % i == 0) {
					return false;
				}
			}

		}
		return true;
	}

}
