package test2;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the input to get square root ");
		int input=sc.nextInt();
		
		if(input>0) {
			System.out.println("square root of the given input is : "+Math.sqrt(input));
		}else {
			System.err.println("Square root cannot be calculated for negative number ");
		}

	}

}
