package videoTutorial;

import java.util.Scanner;

public class prime_series {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter the upper prime number limit:");
        int num= obj.nextInt();
        for (int i= 2; i<=num;i++){
            boolean prime= true;
            for (int j= 2; j*j<=i;j++){
                if (i%j==0){
                    prime = false;
                    break;
                }
            }
            if (prime){
                System.out.print("\t"+i);
            }
        }
    }
}
