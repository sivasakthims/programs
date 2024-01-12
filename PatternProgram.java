package test5;

public class PatternProgram {
	

	    /*
	        *  
	       * *
	      *   *
	     *     *
	    *********
	    */

	    public static void main(String[] args) {

	       for(int row=1;row<=5;row++) {
	    	   for(int column=1;column<=9;column++) {
	    		   if((row==5) || (row+column==6)||(column-row==4)) {
	    			   System.out.print("*");
	    		   }else {
	    			   System.out.print(" ");
	    		   }
	    		   
	    	   }
	    	   System.out.println();
	       }
	    }
	}
