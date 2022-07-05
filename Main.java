import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int num = 5;
        int[] arr = new int[num + 1];
        for (int i = 2; i <= num; i++) {
            arr[i] = -1;
        }
        System.out.println(fibonacciDpTabulation(4));

        fibonacciRecursion(num);
        fibonacciDpMemoization(num, arr);
        fibonacciDpTabulation(num);
    }

    private static int fibonacciRecursion(int num) {
        if (num < 2) {
            return 1;
        }
        return fibonacciRecursion(num - 1) + fibonacciRecursion(num - 2);
    }

    private static int fibonacciDpMemoization(int num, int[] arr) {
        if (num < 2) {
            return 1;
        }
        if (arr[num] != -1) {
            return arr[num];
        }
        return arr[num] = fibonacciDpMemoization(num - 1, arr) + fibonacciDpMemoization(num - 2, arr);
    }

    private static int fibonacciDpTabulation(int num) {
        int[] arr = new int[num + 1];
        arr[0] = 0;
        arr[1] = 0;
        for (int i = 2; i < num; i++) {
         return arr[i] = arr[i - 1] + arr[i - 2];
        }
        return 0;
    }
}
