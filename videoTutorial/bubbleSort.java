package videoTutorial;
public class bubbleSort {
    public static void printArray(int arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
       //Implementing bubble short into Ascending order...
       //Elements are 10 9 11 6 15 2...
        int arr[] = {10, 9, 11, 6, 15, 2};
        int i=0;
        //Time complexity = o(n^2)...
        // Loop will be Executed (n-1) times...
        //Writing outer loop n-1 times...
        for ( i=0; i<arr.length-1; i++){
            //Writing inner loop
            for (int j=0; j<arr.length-i-1; j++){
                if (arr[j]> arr[j+1]){
                    //swap
                   int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Elements are 10 9 11 6 15 2");
        System.out.print("Sorted array are: ");
        printArray(arr);
        System.out.print("Ascending order...");
    }
}
