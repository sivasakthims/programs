package test4;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int input[] = { 10, 20, 10, 30, 20, 40, 50, 50, 60 };
		int replace = -1;

		for (int i = 0; i < input.length; i++) {
			if (input[i] != -1) {

				for (int j = i + 1; j < input.length; j++) {
					if (input[i] == input[j]) {
						input[j] = replace;

					}

				}
				System.out.println(input[i]);

			}
		}

	}

}
