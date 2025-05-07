package Heap;

import java.util.PriorityQueue;

public class Heap {
    public static void main(String[] args) {
        // PriorityQueue<Integer> minHeap = new PriorityQueue<>(); 
        var maxHeap = new PriorityQueue<Integer>((a, b) -> b - a);
        int[] arr = {10, 7, 12, 4, 0, 1};

        for(int i : arr) {
            maxHeap.add(i);
        }
        
        // System.out.println(minHeap.peek());
        System.out.println(maxHeap.peek());
    }
}

//peek gives min or max element of heap O(1)
// add and remove is O(logn)

// Heap is a complete binary tree