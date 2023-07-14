package videoTutorial;

import java.util.Scanner;

public class matrixMultiplication {
    public static void main(String[] args) {
        //Matrix multiplication...
        Scanner obj = new Scanner(System.in);
        int arra[][] = new int[10][10];
        int arrb[][] = new int[10][10];
        int arrc[][] =new int [10][10];
        int a, b, p, q, i, j, k, sum;
        System.out.println("Enter number of rows and colloms of 1st matrix:");
        a = obj.nextInt();
        b = obj.nextInt();
        System.out.println("Enter 1st matrix:");
        for( i=0; i<a; i++) //printing rows 
        {
            for( j=0; j<b; j++) //printiong colloms
            {
                arra[i][j]=obj.nextInt();
            }
        }
          System.out.println("Enter number of rows and colloms of 2nd matrix:");
        p = obj.nextInt();
        q = obj.nextInt();
        System.out.println("Enter 2nd matrix:");
        for( i=0; i<p; i++) //printing rows 
        {
            for( j=0; j<q; j++) //printiong colloms
            {
                arrb[i][j]=obj.nextInt();
            }
        }
        System.out.println("The 1st matrix are:");
        for ( i = 0; i < a; i++) //printing rows
        {
            for (j = 0; j < b; j++) //printing colloms
            {
                System.out.print(arra[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("The 1st matrix are:");
           for ( i = 0; i < p; i++) //printing rows
        {
            for ( j = 0; j < q; j++) //printing colloms
            {
                System.out.print(arrb[i][j]+ " ");
            }
            System.out.println();
        }
       if (b != p) {
        System.out.println("You can not multiply those matrix");
       }
       else{
        for (i=0; i<a; i++){
            for(j=0; j<q; j++){
                sum = 0;
                for(k=0; k<a; k++){
                    sum = sum + arra[i][k] * arrb[k][j];
                }
                arrc[i][j] = sum;
            }
        }
       }
       System.out.println("Matrix multiplication is:");
          for ( i = 0; i < p; i++) //printing rows
        {
            for ( j = 0; j < q; j++) //printing colloms
            {
                System.out.print(arrc[i][j]+ " ");
            }
            System.out.println();
        }

    }
    
}
