package videoTutorial;

public class selectionSort {
    public static void printArray(int arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        //Implementing Selection sort into Ascending order...
        int arr[] = {10, 19, 11, 26, 15, 21, 56, 58, 12};
        //Time complexity =O(n^2)
        //outer loop Execute n-1 times...
        for (int i=0; i<arr.length-1; i++){
            int small= i;
            for (int j=i+1; j<arr.length; j++)
            {
                if (arr[small]> arr[j]){
                    small = j;
                }
            }
            int temp = arr[small];
            arr[small] = arr[i];
            arr[i] = temp;
        }
        System.out.println("Elements are 10, 19, 11, 26, 15, 21, 56, 58, 12");
        System.out.print("Sorted array are: ");
        printArray(arr);
        System.out.print("Ascending order...");
    }
}
