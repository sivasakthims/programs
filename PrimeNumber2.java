package test1;

public class PrimeNumber2 {

	public static void main(String[] args) {

		int a = 4;
		int count = 0;

		int i = 2;
		if(a<=1) {
			count++;
		}
		while (i < a) {
			if (a % i == 0)
				count++;

			i++;
		}
		if (count == 0) {
			System.out.println("the number " + a + " is prime number");
		} else {
			System.out.println("the number " + a + " is not prime number");
		}

	}

}
