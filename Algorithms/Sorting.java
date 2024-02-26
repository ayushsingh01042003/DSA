public class Sorting {

    //Quick Sort

    // public static void main(String[] args) {
    //     int[] arr = {3, 2, 11, 0, 4};
    //     qs(arr, 0, arr.length - 1);
    //     System.out.println(Arrays.toString(arr));
    // }

    // private static void qs(int[] arr, int left, int right) {
    //     if (left < right) {
    //         int p = pivot(arr, left, right);
    //         qs(arr, left, p - 1);
    //         qs(arr, p + 1, right);
    //     }
    // }

    // private static int pivot(int[] arr, int left, int right) {
    //     int pivot = arr[left];
    //     int first = left + 1, last = right;

    //     while (first <= last) {
    //         while (first <= last && arr[first] <= pivot) first++;
    //         while (arr[last] > pivot) last--;

    //         if (first < last) {
    //             swap(arr, first, last);
    //         } else {
    //             swap(arr, left, last);
    //             return last;
    //         }
    //     }
    //     return left; // This is added in case the array is already sorted.
    // }

    // private static void swap(int[] arr, int i, int j) {
    //     int temp = arr[i];
    //     arr[i] = arr[j];
    //     arr[j] = temp;
    // }


    //Bubble sort
    // public static void main(String[] args) {
    //     int arr[] = {3, 4, 0, 5, 23};

    //     for(int i = 0; i < arr.length - 1; i++) {
    //         for(int j = 0; j < arr.length - i - 1; j++) {
    //             if(arr[j] > arr[j + 1]) {
    //                 int temp = arr[j];
    //                 arr[j] = arr[j + 1];
    //                 arr[j + 1] = temp;
    //             }
    //         }
    //     }

    //     System.out.println(Arrays.toString(arr));
    // }


    //Selection Sort


    // public static void main(String[] args) {
    //     int arr[] = {3, 4, 0, 5, 23};

    //     for(int i = 0; i < arr.length - 1; i++) {
    //         int min = i;
    //         for(int j = i + 1; j < arr.length; j++) {
    //             if(arr[j] < arr[min]) {
    //                 min = j;
    //             }
    //         }
    //         swap(arr, i, min);
    //     }

    //     System.out.println(Arrays.toString(arr));
    // }

    // static void swap(int[] arr, int i, int j) {
    //     int temp = arr[i];
    //     arr[i] = arr[j];
    //     arr[j] = temp;
    // }

    //Merge Sort

    // public static void main(String[] args) {
    //     int arr[] = {3, 4, 0, 5, 23};


    // }


}
