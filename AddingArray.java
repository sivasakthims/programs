package test2;

public class AddingArray {

	public static void main(String[]args) {
		 int []a={12,23,34,12,45,12};

		int[] b={12,34,45,67};
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]==a[j]) {
					System.out.println("common element in araary A :"+a[j]);
				}
			}
		}
		
		// comparing two array
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<b.length-1;j++) {
				
				if(a[i]==b[j]) {
					System.out.println("common element in both araary is :"+a[i]);
				}
			}
		}
		
		// duplicate element in each array
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]==a[j]) {
					System.out.println("Duplicate element in araary A :"+a[j]);
				}
			}
			
		}
			//adding two array
		int c[]=new int [a.length];
			for(int i=0;i<b.length;i++) {
				
					
				int	f=a[i]+b[i];
				
				System.out.println(f);
					
				
					
					
				}
			
			
		
	}
}
