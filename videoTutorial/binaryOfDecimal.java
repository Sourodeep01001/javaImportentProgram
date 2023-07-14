package videoTutorial;

import java.util.Scanner;

public class binaryOfDecimal {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter any decimal number:");
        int dec= obj.nextInt();
        String binary= Integer.toBinaryString(dec);
        System.out.println("The binary equivalent of "+dec+" is: "+binary);
    }
}
