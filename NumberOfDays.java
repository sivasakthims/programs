package test4;

import java.util.Scanner;

public class NumberOfDays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the year");
		int year = sc.nextInt();
		System.out.println("enter the month");
		int month = sc.nextInt();

		if (month < 1 || month > 12) {
			System.err.println("in valid month pease enter a month between 1 to 12");
		} else {
			int dayinmonth = daysinmonth(year, month);
			
			System.out.println("In the year of "+year+" month "+month+" has "+dayinmonth+" days");
		}

	}

	private static int daysinmonth(int year, int month) {
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			return 31;

		case 4:
		case 6:
		case 9:
		case 11:
			return 30;
			
		case 2:
			return isleapyear(year) ? 29 : 28;
			
		default:
			return -1;
		}

	}

	private static boolean isleapyear(int year) {
		return (year%400==0) || (year%4==0 && year%100!=0); 
		
		
	}

}
