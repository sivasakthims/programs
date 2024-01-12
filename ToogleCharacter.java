package test10;

public class ToogleCharacter {

	public static void main(String[] args) {
		String input = "ApPlE";
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < input.length(); i++) {
			char currentchar = input.charAt(i);
			if (Character.isUpperCase(currentchar)) {
				result.append(Character.toLowerCase(currentchar));
			} else if (Character.isLowerCase(currentchar)) {
				result.append(Character.toUpperCase(currentchar));
			}

		}
		System.out.println(result);

	}

}
