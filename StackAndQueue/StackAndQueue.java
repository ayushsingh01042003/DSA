package StackAndQueue;

import java.util.*;

class StackAndQueue {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> q = new LinkedList<>();
        Deque<Integer> deque = new ArrayDeque<>();

        stack.push(1);
        stack.pop();
        stack.peek();

        q.add(1);
        q.remove();
        q.peek();
    
        deque.removeFirst();
        deque.removeLast();
        // deque.addFirst(); These return elements
        // deque.addLast();

    }
}
