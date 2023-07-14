package videoTutorial;

import java.util.Scanner;

public class factorialEtrative {
    static int factorial(int num) {
        int fact = 1;
        if (num == 0 || num == 1) {
            return 1;
        } else {
            for (int i = 1; i <= num; i++) {
                 fact *= i;

            }
            return fact;
        }
    }
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter a number:");
        int num= obj.nextInt();
        int fact = factorial(num);
        System.out.println("The factorial of "+num+" is: "+fact);
        ;
    }
}
