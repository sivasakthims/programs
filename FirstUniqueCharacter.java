package test10;
public class FirstUniqueCharacter {
    public static void main(String[] args) {
        String inputStr1 = "tech tricks";
        String inputStr2 = "my my";

        System.out.println("Input 1: " + inputStr1);
        char firstUniqueChar1 = findFirstUniqueChar(inputStr1);
        if (firstUniqueChar1 != '\0') {
            System.out.println("First unique character: " + firstUniqueChar1);
        } else {
            System.out.println("All characters are repeating");
        }

        System.out.println("\nInput 2: " + inputStr2);
        char firstUniqueChar2 = findFirstUniqueChar(inputStr2);
        if (firstUniqueChar2 != '\0') {
            System.out.println("First unique character: " + firstUniqueChar2);
        } else {
            System.out.println("All characters are repeating");
        }
    }

    static char findFirstUniqueChar(String inputStr) {
        int[] charCount = new int[256];

        for (char c : inputStr.toCharArray()) {
            charCount[c]++;
        }

        for (char c : inputStr.toCharArray()) {
            if (charCount[c] == 1) {
                return c;
            }
        }

        return '\0';
    }
}
