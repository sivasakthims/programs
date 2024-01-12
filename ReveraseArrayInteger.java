package test5;

public class ReveraseArrayInteger {

	public static void main(String[] args) {
		int a[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
			}
			System.out.print(a[i] + " ");

		}
	}

}
