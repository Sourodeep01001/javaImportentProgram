package videoTutorial;

import java.util.Arrays;
import java.util.Scanner;

public class binarySearch {
    public static int binarySearch(int[] arr, int ans) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == ans) {
                return mid;
            } else if (arr[mid] < ans) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter searching item:");
        int ans = scanner.nextInt();

        // Check if the array is sorted
        if (!isSorted(arr)) {
            System.out.println("Error: The array is not sorted.");
            return;
        }

        // Perform binary search
        int index = binarySearch(arr, ans);

        if (index == -1) {
            System.out.println("The element is not found.");
        } else {
            System.out.println("The element is found at index: " + index);
        }
    }
}