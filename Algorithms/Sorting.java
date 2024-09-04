import java.util.*;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = {2, -1, 21, 7, 0, 4};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSort(int[] arr, int low, int high) {
        if(low == high) {
            return;
        }
        
        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    static void merge(int[] arr, int low, int mid, int high) {
        List<Integer> al = new ArrayList<>();
        int i1 = low, j1 = mid, i2 = mid + 1, j2 = high;

        while(i1 <= j1 && i2 <= j2) {
            if(arr[i1] < arr[i2]) {
                al.add(arr[i1]);
                i1++;
            } else {
                al.add(arr[i2]);
                i2++;
            }
        }

        while(i1 <= j1) {
            al.add(i1);
            i1++;
        }
        while(i2 <= j2) {
            al.add(i2);
            i2++;
        }

        for(int i = low; i <= high; i++) {
            arr[i] = al.get(i - low);
        }
    }
}