package test1;

public class MovingNumbers {

	public static void main(String[] args) {
		int[] A = { 1, -1, -3, 4, 6, 5 };
		int temp;

		for (int i = 0; i < A.length ; i++) {
			for (int j = i + 1; j < A.length; j++) {
				if (A[i] > A[j]) {
					temp = A[i];
					A[i] = A[j];
					A[j] = temp;
				}

			}
			System.out.print(A[i]+" ");

		}
	}

}
