package test9;

import java.util.Arrays;

public class MergeArrays {
	public static void main(String[] args) {
		String[] array1 = { "Hello", "World" };
		String[] array2 = { "Java", "Programming" };

		String[] mergedArray = new String[array1.length + array2.length];
		System.arraycopy(array1, 0, mergedArray, 0, array1.length);
		System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);

		System.out.println("Merged Array: " + Arrays.toString(mergedArray));
	}
}
