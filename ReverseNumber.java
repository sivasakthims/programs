package test2;

import java.util.Scanner;
public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to reverse");
		int input =sc.nextInt();
		int reversednumber=reverse(input);
		
		System.out.println("The reversal of "+input+" is :"+reversednumber);
		

	}
	
	private static int reverse(int num) {
		
		int reversed =0;
		while(num!=0) {
			
			int digit=num%10;
			reversed=reversed*10+digit;
			num=num/10;
			
		}
		
		return reversed;
	}

}
