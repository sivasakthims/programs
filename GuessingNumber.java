package test3;

import java.util.Scanner;

public class GuessingNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to guessing game");
		System.out.println();
		//boolean t=true;
		while (true) {
			System.out.println("Enter a number between 1 to 100");
			int input = sc.nextInt();

			int a = 27;

			do {

				if (input > a) {
					System.err.println("uh-oh you'r guess is higher than the number\n");

				} else if (input < a) {
					System.err.println("uh-oh you'r guess is lower than the number\n");

				} else {
					System.out.println("yeah! you'r guess the correct number\n");
					//t=false;
					break;
					
				}
				

			} while (input == a) ;
		
			
			

		}

	}
}
