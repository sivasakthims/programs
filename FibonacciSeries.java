package test4;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the input to get fibonacci series");
		int n = sc.nextInt();

		int a = 0;
		int b = 1;
		System.out.println(a + "\n" + b);
		if (n > 0) {
			for (int i = 0; i < n - 2; i++) {
				int c = a + b;
				a = b;
				b = c;
				System.out.println(c);

			}
		}

	}

}
