package test2;
import java.util.Scanner;

public class LeapYear {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input from the user
	        System.out.print("Enter a year: ");
	        int year = scanner.nextInt();

	        // Check if the year is a leap year
	        if (year % 400 == 0|| year%4==0) {
	            System.out.println(year + " is a leap year.");
	        } else {
	            System.out.println(year + " is not a leap year.");
	        }

	        scanner.close();
	    }
	}
