/*write a program to print the even numbers from a given list.
*/

package test4;

public class EvenNumber {

	public static void main(String[] args) {
		 int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		evennumber(a);
	}

	private static void evennumber(int[] a) {
		int sum=0;
		for(int result:a) {
			if(result%2==0) {
					System.out.println(result);

			}
		}
	}

}
