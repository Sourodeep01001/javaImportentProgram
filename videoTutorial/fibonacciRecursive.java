package videoTutorial;

import java.util.Scanner;
public class fibonacciRecursive {
    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
    int n = scanner.nextInt();

        System.out.print("The first " + n + " terms of the Fibonacci series are: ");

        for (int i = 0; i < n; i++) {
        System.out.print(fibonacci(i) + " ");
    }
}
}