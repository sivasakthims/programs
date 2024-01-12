package test10;
public class ReverseStringRecursion {
    public static void main(String[] args) {
        String inputStr = "hello";
        String reversedStr = reverseString(inputStr);

        System.out.println("Input: " + inputStr);
        System.out.println("Reversed: " + reversedStr);
    }

    static String reverseString(String inputStr) {
        if (inputStr.isEmpty()) {
            return inputStr;
        } else {
            return reverseString(inputStr.substring(1)) + inputStr.charAt(0);
        }
    }
}
