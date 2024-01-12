package test10;

public class CompareTwoString {

	public static void main(String[] args) {
		String s1 = "java program";
		String s2 = "java program";

		boolean result = Compare(s1, s2);
		
		if(result==true) {
			System.out.println("the given strings are same");
		}else {
			System.err.println("the given strings are not same");

		}

	}

	private static boolean Compare(String s1, String s2) {

		if (s1.length() != s2.length()) {
			return false;
		}
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				return false;
			}
		}
		return true;

	}

}
