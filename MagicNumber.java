package test2;
import java.util.Scanner;

public class MagicNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        boolean isMagicNumber = checkMagicNumber(number);

        if (isMagicNumber) {
            System.out.println(number + " is a magic number.");
        } else {
            System.out.println(number + " is not a magic number.");
        }

        scanner.close();
    }

    // Function to check if a number is a magic number
    private static boolean checkMagicNumber(int num) {
        while (num > 9) {
            num = getSumOfDigits(num);
        }

        return num == 1;
    }

    private static int getSumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
