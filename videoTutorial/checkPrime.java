package videoTutorial;

import java.util.Scanner;

public class checkPrime {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter any number:");
        int number= obj.nextInt();
        boolean prime= true;
        for (int i=2;i<=Math.sqrt(number); i++){
          if (number%i == 0){
              prime = false;
              break;
          }
        }
        if (prime){
            System.out.println(number+" is a prime number.");
        }
        else{
            System.out.println(number+" is not a prime number.");
        }
    }
}
