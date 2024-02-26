package Heap;

import java.util.PriorityQueue;

public class Heap {
    public static void main(String[] args) {
        // PriorityQueue<Integer> minHeap = new PriorityQueue<>(); default is minHeap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        int[] arr = {10, 7, 12, 4, 0, 1};

        for(int i : arr) {
            maxHeap.add(i);
        }
        System.out.println(maxHeap);
    }
}
