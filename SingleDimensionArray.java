package test3;

public class SingleDimensionArray {

	public static void main(String[] args) {

		int a[] = { 2, 3, 4, 5, 6, 7, 8, 9 };
		int square[]=new int[a.length];
		System.out.print("(value\tindex\tsquare)");
	    System.out.println();
		
		for (int i = 0; i < a.length; i++) {
			
			square[i]=a[i]*a[i];
			
			System.out.println("(  "+a[i]+"\t  "+i+"\t  "+square[i]+" )");
			
			

		}

	}

}
