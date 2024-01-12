package test10;
import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        int digitCount = countDigits(number);

        System.out.println("Number of digits in " + number + ": " + digitCount);

        scanner.close();
    }

    static int countDigits(long num) {
        int digitCount = Long.toString(Math.abs(num)).length();
        return digitCount;
    }
}
