package test5;


import java.util.Scanner;

public class AvaragerOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double avarage=0;
		System.out.println("enter the number of  inputs");
		int n = sc.nextInt();
		int input[] = new int[n];
		System.out.println("enter " + n + " input");
		for (int i = 0; i < n; i++) {
			input[i] = sc.nextInt();
		}
		for (int i=0;i<input.length;i++) {
			
			
			avarage=avarage+input[i];
			
		}
		
		System.out.println("The Avarage of given input = "+avarage/n);

	}

}
