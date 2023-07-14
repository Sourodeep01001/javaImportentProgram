package videoTutorial;

import java.util.Scanner;
public class fibonacciIterative {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = obj.nextInt();

        int a = 0;
        int b = 1;
        int c;

        System.out.print("The first " + n + " terms of the Fibonacci series are: ");
        System.out.print(a + " ");
        System.out.print(b + " ");

        for (int i = 2; i <= n; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
