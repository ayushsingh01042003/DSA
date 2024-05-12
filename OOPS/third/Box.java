package OOPS.third;

/**
 * Box
 */
public class Box {
    int l;
    int w;
    int h;
    private int[] arr; 

    public int[] getArr() {
        return arr;
    }

    Box() {
        this.l = -1;
        this.w = -1;
        this.h = -1;
        arr = new int[10];
    }

    Box(int l, int w, int h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    Box(Box old) {
        this.l = old.l;
        this.w = old.w;
        this.h = old.h;
    }

    static void display() {
        System.out.println("This is the box class");
    }

    //If I use final or private for a function that you cannot override that function
    //If i use final for a class it prevents inheritance that is other classes cannot extend this calss now
}