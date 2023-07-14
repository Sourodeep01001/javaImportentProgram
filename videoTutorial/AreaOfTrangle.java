package videoTutorial;

import java.util.Scanner;

public class AreaOfTrangle {
    public static void main(String[] args) {
        Scanner obj =new Scanner(System.in);
        System.out.println("Enter the length of side 1:");
        double side1= obj.nextDouble();
        System.out.println("Enter the length of side 2:");
        double side2= obj.nextDouble();
        System.out.println("Enter the length of side 3:");
        double side3= obj.nextDouble();
        double parameter = (side1+ side2+ side3)/2;
        double area= Math.sqrt(parameter * (parameter-side1) * (parameter-side2)* (parameter-side3));
        System.out.println("the area of triangle is: "+ area);
    }
}
