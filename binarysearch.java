package test3;

public class binarysearch {

	public static void main(String[] args) {
		int input[] = { -1, 0, 3, 5, 9, 12 };
		// target =9

		int key = 9;
		int lb = 0;
		int ub = input.length - 1;
		int count = 0;

		while (lb <= ub) {
			int mid = (lb + ub) / 2;
			if (input[mid] == key) {
				System.out.println("the element " + input[mid] + " present in the index " + mid);
				count++;
				break;
			}

			else if (input[mid] < key) {
				lb = mid + 1;

			} else {
				ub = mid - 1;
			}
		}

		if (count == 0) {
			System.err.println("the element not present in the list");
		}

	}
}