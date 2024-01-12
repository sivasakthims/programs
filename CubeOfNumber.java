package test5;
import java.util.Scanner;

public class CubeOfNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
		
		int result=i*i*i;
		System.out.println("cube of "+i+"="+result);
		}
		
		
				

	}

	
}
