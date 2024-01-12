package test4;

public class PatternProgram2 {

	public static void main(String[] args) {
    
	/*	  *
	     *** 
        ***** 
       *******
      *********  */
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<4-i;j++) {
				System.out.print(" ");
			}
			
			for(int k=0;k<1+i*2;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
