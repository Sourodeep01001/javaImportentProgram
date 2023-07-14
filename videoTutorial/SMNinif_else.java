package videoTutorial;

import java.util.Scanner;

public class SMNinif_else {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int a= obj.nextInt();
        System.out.println("Enter 2nd number:");
        int b= obj.nextInt();
        System.out.println("Enter 3rd number:");
        int c= obj.nextInt();
        if (a>b && a<c){
            if (b>c){
                System.out.println(b+"is the 2nd largest number");
            }
            else {
                System.out.println(c+" is the 2nd largest number.");
            }
        } else if (b>a && b>c) {
            if (a>c){
                System.out.println(a+" is the 2nd largest number");
            }
            else {
                System.out.println(c+" is the 2nd largest number");
            }
        }
        else {
            if (a>b){
                System.out.println(a+" is the 2nd largest number");
            }
            else{
                System.out.println(b+ " is the 2nd largest number");
            }
        }
    }
}
