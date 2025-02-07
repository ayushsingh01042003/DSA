// recursive func if low < high
// get Idx, sort low to Idx - 1 and Idx + 1 to high
// sort func:
// pick a pivot(lets say 1st element)
// from left find element > pivot
// from right find element < pivot
// if i < j -> swap i and j
// else swap pivot and j

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {4, 6, 2, 5, 7, 9, 1, 3};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[] arr, int low, int high) {
        if(low < high) {
            int pIdx = getPivot(arr, low, high);
            quickSort(arr, low, pIdx - 1);
            quickSort(arr, pIdx + 1, high);
        }
    }

    static int getPivot(int[] arr, int low, int high) {
        int pivot = low, i = low, j = high;
        
        while(i < j) {
            while(arr[i] <= arr[pivot] && i <= high) {
                i++;
            }
            while(arr[j] > arr[pivot] && j >= low) {
                j--;
            }
            if(i < j) {
                swap(arr, i, j);
            } else {
                swap(arr, j, pivot);
            }
        }
        return j;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
