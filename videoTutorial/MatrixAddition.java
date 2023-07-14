package videoTutorial;

import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        int arra[][] = new int[10][10];
        int arrb[][] = new int[10][10];
        int arrc[][] = new int[10][10];
        int a, b, q, r, i, j;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter row and colloms of 1st matrix:");
        a = obj.nextInt();
        b = obj.nextInt();
        System.out.println("Enter 1st matrix:");
        for (i = 0; i < a; i++) {
            for (j = 0; j < b; j++) {
                arra[i][j] = obj.nextInt();
            }
        }
        System.out.println("Enter row and colloms of 2nd matrix:");
        q = obj.nextInt();
        r = obj.nextInt();
        System.out.println("Enter 1st matrix:");
        for (i = 0; i < q; i++) {
            for (j = 0; j < r; j++) {
                arrb[i][j] = obj.nextInt();
            }
        }
        System.out.println("1st matrix is:");
         for (i = 0; i < a; i++) {
            for (j = 0; j < b; j++) {
                System.out.print(arra[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("2nd matrix is:");
          for (i = 0; i < q; i++) {
            for (j = 0; j < r; j++) {
                System.out.print(arrb[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Addition of two matrix are: ");
        for(i = 0; i< a; i++){
            for(j=0; j < b; j++){
                arrc[i][j] = arra[i][j] + arrb[i][j];
                System.out.print(arrc[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
