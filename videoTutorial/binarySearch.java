package videoTutorial;

import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int arra[] = new int[10];
        int a, i, item, beg, mid=0, end, c=0;
        System.out.println("Enter array size:");
        a = obj.nextInt();
        System.out.println("Enter array elements:");
        for(i = 0; i < a; i++){
            arra[i] = obj.nextInt();
        }
        System.out.println("input searching element...");
        item = obj.nextInt();
        beg = 0; end = i-1;
        while (beg<=end) {
            mid = (beg + end) /2;
            if (arra[mid] == item) {
                c++;
                break;
            }
            else if (arra[mid] > item) {
                beg = mid+1;
            }
            else if (arra[mid] < item) {
                end = mid-1;
            }

        }
        if (c>0) {
            System.out.println("Item found"+mid);
        }
        else{
            System.out.println("Item not found");
        }
    }
}
