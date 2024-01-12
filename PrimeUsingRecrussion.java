package test3;

public class PrimeUsingRecrussion {

	public static void main(String[] args) {
		int number = 1;
		if (isprime(number)) {
			System.out.println(number + " is a prime number");

		} else {
			System.out.println(number + " is not a prime number");
		}
	}

	static boolean isprime(int num, int i) {
		if (i == 1) {
			return true;
		} else {
			if (num % i == 0) {
				return false;
			} else {
				return isprime(num, i - 1);
			}
		}

	}

	static boolean isprime(int num) {
		return isprime(num, num / 2);
	}

}
