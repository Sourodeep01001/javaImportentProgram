package videoTutorial;

import java.util.Scanner;

public class calculateRoots {
    public static void main(String[] args) {
    double r1, r2;
    Scanner obj= new Scanner(System.in);
        System.out.println("Enter a, b, and c: ");
        double a= obj.nextDouble();
        double b= obj.nextDouble();
        double c= obj.nextDouble();
        double d= (b*b)- (4*a*c);
        if (d==0){
            System.out.println("Roots are real and equal");
            r1= r2= -b/(2*a);
            System.out.println("R1"+ r1);
            System.out.println("R2"+ r2);
        } else if (d>0) {
            System.out.println("Roots are real and distinct");
            r1= (-b+ Math.sqrt(d))/ (2*a);
            r2= (-b- Math.sqrt(d))/ (2*a);
            System.out.println("R1= "+r1);
            System.out.println("R2= "+r2);
        }
        else {
            System.out.println("Roots are distinct and imaginary ");
            double x= -d/(2*a);
            double y = Math.sqrt(-d) / (2*a);
            System.out.println("R1= "+x+ "+i"+ y);
            System.out.println("R2= "+x+ "-i"+ y);
        }
    }
}
//. Find the roots of a quadratic equation including complex
//roots.
