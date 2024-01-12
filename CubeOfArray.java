package test3;

public class CubeOfArray {

	public static void main(String[] args) {

		int a[] = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 22 };

		int b[] = new int[a.length];

		for (int i = 0; i < a.length; i++) {

			b[i] = a[i] * a[i] * a[i];

			System.out.println(b[i]);

		}

	}

}
