package videoTutorial;

import java.util.Scanner;

public class SMNTernary {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int a= obj.nextInt();
        System.out.println("Enter 2nd number:");
        int b= obj.nextInt();
        System.out.println("Enter 3rd number:");
        int c= obj.nextInt();
        int secandLarge= (a>b && a>c)? (b>c? b:c):(b>a && b>c)? (a>c? a:c):(a>b?a:b);
        System.out.println("The 2nd largest number is: "+ secandLarge);
    }
}
