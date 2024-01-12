package test1;

public class FibonnacciRecrusion {
	static int a = 0, b = 1, c = 0;

	static void fibonacci(int count) {
		if (count > 0) {
			c = a + b;
			a = b;
			b = c;
			System.out.println(""+c);
			fibonacci(count-1);
		}
	}

	public static void main(String[] args) {
		int count = 20;
		System.out.println(a);
		System.out.println(b);
		fibonacci(count-2);

	}

}
