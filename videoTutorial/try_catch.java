package videoTutorial;

import java.util.Scanner;

public class try_catch {
    public static void main(String[] args) {
        try (//Example of number format excretion 
        var obj = new Scanner(System.in)) {
            int count = 0;
            do {
                System.out.println("Enter a year:");
                try{
                    String input = obj.nextLine();
                    int converter = Integer.parseInt(input);
                    if (converter % 400 == 0) {
                        if (converter % 100 == 0) {
                            System.out.println(converter + " is Leap year");
                        } else {
                            System.out.println(converter + " Is not leap year");
                        }
                    } else {
                        if (converter % 4 == 0) {
                            System.out.println(converter + " Is Leap year");
                        } else {
                            System.out.println(converter + " Not leap year");
                        }
                    }
                    count = 0;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input");
                    count++;
                }
            } while (count < 3);
            if (count == 3) {
                System.out.println("You have exceeded the maximum number of attempts.");
            }
        }
    }
}