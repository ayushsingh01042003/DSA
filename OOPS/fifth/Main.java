package OOPS.fifth;

import java.util.Arrays;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Human h1 = new Human(150, 50);
        Human h2 = new Human(180, 70);
        Human h3 = new Human(170, 60);

        Human[] human = {h1, h2, h3};

        Arrays.sort(human, (o1, o2) -> {
            return (o1.height - o2.height);
        });

        for(Human h : human) {
            System.out.println(h.weight);
        }
    }
}