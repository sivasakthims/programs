package test1;
public class FibonacciArray {
    public static void main(String[] args) {
        int[] fibonacciArray = generateFibonacciArray(30);

        System.out.println("Fibonacci Sequence (first 30 terms):");
        printArray(fibonacciArray);
    }

    private static int[] generateFibonacciArray(int n) {
        int[] fibonacciArray = new int[n];

        fibonacciArray[0] = 0;
        fibonacciArray[1] = 1;

        for (int i = 2; i < n; i++) {
            fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
        }

        return fibonacciArray;
    }

    private static void printArray(int[] array) {
        for (int i : array) {
            System.out.println(i + " ");
        }
        System.out.println();
    }
}
