package test4;
import java.util.Scanner;

/* Find if number is a Pronic number. 
Pronic Number is the product of two 
consecutive integers, n(n+1). e.g. 56=7×8. */

public class PronicNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("To find pronic number or not\n");
		System.out.println("enter the first number");
		int a=sc.nextInt();
		System.out.println("enter the second number");
		int b=sc.nextInt();
		
		
		if(b==a+1) {
		int n=a*(a+1);
		System.out.println(a+"*"+b+"="+n);
		System.out.println("The number is pronic ");
		
		}else {
			int n=a*(a+1);
			System.out.println(a+"*"+b+"="+n);
			System.err.println("the number is not a pronic ");
		}
		
		

	}

}
