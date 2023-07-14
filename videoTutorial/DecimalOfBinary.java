package videoTutorial;

import java.util.Scanner;

public class DecimalOfBinary {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter any binary number:");
        String bin= obj.nextLine();
        int dec= Integer.parseInt(bin, 2);
        System.out.println("The decimal equivalent of "+bin+" is: "+dec);
    }
}
