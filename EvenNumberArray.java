package test5;
import java.util.Scanner;

public class EvenNumberArray {
	

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			
			System.out.println("enter the number of element ");
			int n=sc.nextInt();
			int input[]=new int[n];
			
			System.out.println("enter "+n+" element");
			
			for(int i=0;i<n;i++) {
				input[i]=sc.nextInt();
			}
			

			evennumber(input);
		}

		private static void evennumber(int[] a) {
			System.out.println("The even numbers in the given inputs are:");
			int sum=0;
			for(int result:a) {
				if(result%2==0) {
						System.out.println(result);

				}
			}
		}

	}
