package test9;

import java.util.HashMap;
import java.util.Map;

public class CountRepeatedWords {
	public static void main(String[] args) {
		String inputString = "This is a sample string . This string contains repeated words.";
		String[] words = inputString.split("\\s+");

		Map<String, Integer> wordCountMap = new HashMap<>();

		for (String word : words) {
			wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
		}

		for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
			System.out.println("Word: " + entry.getKey() + ", Count: " + entry.getValue());
		}
	}
}
