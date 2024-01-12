package test9;
import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        System.out.print("Enter the digit to count: ");
        int digit = scanner.nextInt();

        int frequency = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            if (lastDigit == digit) {
                frequency++;
            }
            number /= 10;
        }

        System.out.println("Frequency of digit " + digit + " is: " + frequency);
    }
}

