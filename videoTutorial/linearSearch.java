package videoTutorial;

import java.util.Scanner;

public class linearSearch {
    private static Scanner obj;

    public static void main(String[] args) {
         obj = new Scanner(System.in);
        int arra[] = new int[100];
        int a, i, item, counter=0;
        System.out.println("Enter array size:");
        a = obj.nextInt();
        System.out.println("Input elements in the array:");
        for(i = 0; i < a; i++){
            arra[i] = obj.nextInt();
        }
        System.out.print("input searching item...");
        item = obj.nextInt();
        for(i = 0; i<a; i++)
        {
            if(arra[i] == item){
                counter++;
                break;
            }
          
        }
         if(counter > 0){
                
                System.out.println("Element found at the index of "+i);
                
            }
             else{
                System.out.println("Element not found");
                
            }
    }
}
