// Recursively split low-mid and mid+1 to high then call merge function
// base case will be low == high
// For the merge function:
// make temp arr and get pointers left and right arrays
// iterate with both pinters together to put elements in correct order in temp
// put the remaining items from left or right
// iterate over temp and put the correct order in arr

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {3 ,1, 2, 4, 5, 2, 6, -1};
        mergeSort(0, arr.length - 1, arr);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSort(int low, int high, int[] arr) {
        if(low == high) {
            return;
        }
        int mid = (low + high) / 2;
        mergeSort(low, mid, arr);
        mergeSort(mid + 1, high, arr);        
        merge(low, mid, high, arr);
    }

    static void merge(int low, int mid, int high, int[] arr) {
        int left = low;
        int right = mid + 1;
        List<Integer> temp = new ArrayList<>();
        
        while(left <= mid && right <= high) {
            if(arr[left] < arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        while(left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        while(right <= high) {
            temp.add(arr[right]);
            right++;
        }

        for(int i = 0; i < temp.size(); i++) {
            arr[i + low] = temp.get(i);
        }
    }
}