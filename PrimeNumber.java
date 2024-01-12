package test1;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int a = sc.nextInt();

		boolean prime = isprime(a);

		if (prime) {
			System.out.println(a+" the number is prime number");
		} else {
			System.err.println(a+" the number is not a prime number");
		}

	}

	static private boolean isprime(int a) {
		if (a < 1) {
			return false;
		}else if(a >= 1) {
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				return false;
			
			}
		}
		}
		return true;
	
	}

}
