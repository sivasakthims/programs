package test9;

public class RemoveSpaces {
	public static void main(String[] args) {
		String inputString = "This is a sample string with spaces";
		String stringWithoutSpaces = inputString.replaceAll("\\s", "");
		System.out.println("Original string: " + inputString);
		System.out.println("String without spaces: " + stringWithoutSpaces);
	}
}
