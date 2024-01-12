package test10;
import java.util.Scanner;

public class CharCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputStr = scanner.nextLine();

        System.out.print("Enter the character to count: ");
        char charToCount = scanner.next().charAt(0);

        int count = countChar(inputStr, charToCount);

        System.out.println("Occurrences of '" + charToCount + "' in the string: " + count);

        scanner.close();
    }

    static int countChar(String inputStr, char charToCount) {
        int count = 0;

        for (int i = 0; i < inputStr.length(); i++) {
            if (inputStr.charAt(i) == charToCount) {
                count++;
            }
        }

        return count;
    }
}
