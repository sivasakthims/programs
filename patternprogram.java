package test4;
public class patternprogram{
	public static void main(String []args) {
	 /*   *

	      **

	      ***

	      *********   */
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0;i<1;i++) {
			for(int j=0;j<9;j++) {
				System.out.print("*");
			}
		}
	}
}