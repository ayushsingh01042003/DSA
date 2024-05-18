package OOPS.fifth;

import java.util.List;

/**
 * CustomArrayList
 */
public class CustomArrayList<T extends Number> { // only Number class and classes that extend it are allowed to be used as T
    private Object[] arr;
    private final int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList() {
        this.arr = new Object[DEFAULT_SIZE];
    }

    public void add(T num) {
        if(this.isFull()) {
            resize();
        }
        arr[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[arr.length * 2];

        for(int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }

        arr = temp;
    }

    private boolean isFull() {
        return arr.length == size;
    }

    public T get(int idx) {
        return (T)arr[idx];
    }

    public T remove() {
        T removedItem = (T)arr[--size];
        return removedItem;
    }

    public void demo(List<? extends Number> list) {// ? enables you to pass Number and its subclasses here
        //something 
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

