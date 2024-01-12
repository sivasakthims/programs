package test1;

public class AddTwoMatrix {
	public static void main(String[] args) {

		int[][] matrix1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] matrix2 = { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } };

		int[][] resultMatrix = addMatrices(matrix1, matrix2);

		System.out.println("Resultant Matrix after addition:");
		displayMatrix(resultMatrix);
	}

	private static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
		int rows = matrix1.length;
		int columns = matrix1[0].length;

		int[][] resultMatrix = new int[rows][columns];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}

		return resultMatrix;
	}

	private static void displayMatrix(int[][] matrix) {
		for (int[] row : matrix) {
			for (int element : row) {
				System.out.print(element + " ");
			}
			System.out.println();
		}
	}
}
