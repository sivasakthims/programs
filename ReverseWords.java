package test10;
public class ReverseWords {
    public static void main(String[] args) {
        String inputStr = "simple logic!";
        String reversedStr = reverseWords(inputStr);

        System.out.println("Input: " + inputStr);
        System.out.println("Output: " + reversedStr);
    }

    static String reverseWords(String inputStr) {
        String[] words = inputStr.split("\\s+");
        StringBuilder reversedStr = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversedStr.append(words[i]).append(" ");
        }

        return reversedStr.toString().trim();
    }
}
