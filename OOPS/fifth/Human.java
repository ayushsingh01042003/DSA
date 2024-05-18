package OOPS.fifth;

/**
 * Dino
 */
public class Human implements Comparable<Human> {
    int height;
    int weight;

    public Human() {
        this.height = 0;
        this.weight = 0;
    }

    public Human(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Human h) {
        return (this.height - h.height);
    }
    
}