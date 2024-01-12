package test3;

public class PrintPrime {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,23 };

		boolean prime = true;

		for (int i = 0; i < a.length; i++) {

			if (a[i] > 1) {
				for (int j = 2; j < a[i]; j++) {
					if (a[i] % j == 0) {
						prime = false;
						break;
					}

				}
				if (prime == true) {
					System.out.println(a[i] + " ");

				}

			}
			prime = true;

		}

	}

}
