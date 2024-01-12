package test1;

public class FindDuplicateInArray {

	public static void main(String[] args) {
		int input[]= {10,20,10,30,20,40,50,50,60};
		
		for (int i=0;i<input.length;i++) {
			for(int j=i+1;j<input.length;j++) {
				
				if(input[i]==input[j]) {
					System.out.println("In index "+j+" the value "+input[j]+" is duplicate / repeated");
				}
			}
		}

	}

}
