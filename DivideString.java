package test9;

public class DivideString {
	public static void main(String[] args) {
		String inputString = "abcdefghijklmnopqrstuvwxy";
		System.out.println("The given string is: " + inputString);

		int partSize = 5;
		int length = inputString.length();

		for (int i = 0; i < length; i += partSize) {
			String substring = inputString.substring(i, Math.min(i + partSize, length));
			System.out.println(substring);
		}
	}
}
