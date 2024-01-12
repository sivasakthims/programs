package test1;

public class SquareRootBinarySearch {
	public static void main(String[] args) {
		double number = 25.0; 
		double squareRoot = findSquareRoot(number);
		System.out.println("Square root of " + number + " is approximately: " + squareRoot);
	}


	private static double findSquareRoot(double number) {
		return squareRootBinarySearch(number, 0, number, 0.00001);
	}

	private static double squareRootBinarySearch(double number, double low, double high, double epsilon) {
		double mid = (low + high) / 2;
		double square = mid * mid;

		
		if (Math.abs(square - number) < epsilon) {
			return mid;
		}

		
		if (square < number) {
			return squareRootBinarySearch(number, mid, high, epsilon);
		} else {
			return squareRootBinarySearch(number, low, mid, epsilon);
		}
	}
}
