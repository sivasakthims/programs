package test9;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeating {
	public static void main(String[] args) {
		String inputString = "xyzxyzyy";
		int maxLength = longestSubstringLength(inputString);
		System.out.println("Length of the longest substring without repeating characters: " + maxLength);
	}

	private static int longestSubstringLength(String s) {
		Set<Character> set = new HashSet<>();
		int maxLength = 0;
		int left = 0;
		int right = 0;

		while (right < s.length()) {
			if (!set.contains(s.charAt(right))) {
				set.add(s.charAt(right));
				right++;
				maxLength = Math.max(maxLength, set.size());
			} else {
				set.remove(s.charAt(left));
				left++;
			}
		}

		return maxLength;
	}
}
