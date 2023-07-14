package videoTutorial;

public class insertionSort {
    public static void printArray(int arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        //Implementing insertion short into Ascending order...
        //time complexity = O (n^2)...
        int arr[]= {12, 54, 58, 64, 456, 785, 45, 10};
        //outer for loop...
        for (int i=0; i<arr.length; i++){
            //inner loop...
            int current = arr[i];
            int j = i-1;
            while(j >= 0 && current<arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            // placement
            arr[j+1] = current;
        }
        System.out.println("Elements are 12, 54, 58, 64, 456, 785, 45, 10");
        System.out.print("Sorted array are: ");
        printArray(arr);
        System.out.print("Ascending order...");
    }
}
