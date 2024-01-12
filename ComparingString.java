package test2;
import java.util.Scanner;
public class ComparingString {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the first String");
		String input1=sc.next();
		System.out.println("Enter the second string");
		String input2=sc.next();
		
		Boolean isequal=ComparingString( input1,input2);
		
		if(isequal) {
			System.out.println("both the strings are equal");
		}else {
			System.err.println("the given strings are not equal");
		}

	}

	private static Boolean ComparingString(String input1, String input2) {
		
		Boolean compare=input1.equalsIgnoreCase(input2);
		return compare;
	}

}
