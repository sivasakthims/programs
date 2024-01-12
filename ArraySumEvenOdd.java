package test1;
public class ArraySumEvenOdd {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        System.out.println("Array elements:");
        printArray(numbers);

        int sumEven = sumElementsAtEvenIndexes(numbers);
        int sumOdd = sumElementsAtOddIndexes(numbers);

        System.out.println("Sum of elements at even indexes: " + sumEven);
        System.out.println("Sum of elements at odd indexes: " + sumOdd);
    }

    private static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println(); 
    }

    // Function to calculate the sum of elements at even indexes
    private static int sumElementsAtEvenIndexes(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i += 2) {
            sum += array[i];
        }
        return sum;
    }


    private static int sumElementsAtOddIndexes(int[] array) {
        int sum = 0;
        for (int i = 1; i < array.length; i += 2) {
            sum += array[i];
        }
        return sum;
    }
}
