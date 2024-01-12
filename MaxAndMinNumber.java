package test3;

public class MaxAndMinNumber {

	public static void main(String[] args) {
		int a[] = { 2, 22, 10, 32, 42, 25, 66 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}

			}
			System.out.println(a[i]);
		}
		
		System.out.println("minimum element in the array is "+a[0]);
		System.out.println("maximum element in the array is "+a[a.length-1]);
		
	}

}
