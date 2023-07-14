package videoTutorial;

import java.util.Scanner;

public class SMNMethod {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int a= obj.nextInt();
        System.out.println("Enter 2nd number:");
        int b= obj.nextInt();
        System.out.println("Enter 3rd number:");
        int c= obj.nextInt();
        int secandLarge = Math.max(Math.min(a,b), Math.min(Math.max(a,b), c));
        System.out.println("the secand largest number is: "+secandLarge);
    }
}
