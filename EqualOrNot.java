package test4;

/*Write a Java program that accepts three numbers 
 * and prints "All numbers are equal" 
 * if all three numbers are equal, 
 * "All numbers are different" if all three numbers are different 
 * and "Neither all are equal or different" otherwise.

output: Input first number: 2564

Input second number: 3526

 Input third number: 2456 

*/
import java.util.Scanner;

public class EqualOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter first set of numbers");
		int a = sc.nextInt();

		System.out.println("enter second set of numbers");
		int b = sc.nextInt();

		System.out.println("enter third set of numbers");
		int c = sc.nextInt();
		
		if(a==b & b==c & a==c) {
			System.out.println("all number are equal");
			
		}else if(a==b||b==c||a==c) {
			System.out.println("Neither all are equal or different");
			
		}else {
			System.out.println("all are different");
		}

	}

}
