
package OOPS.first;

public class Student { // For this class to be imported in different packages make it public 
    int rno, age;
    String name;
    static int strength;

    static {
        //To initialise the static members of the class
        //Executed only once, when the class is loaded
        strength = 0;
    }

    public Student() {
        this.rno = 0;
        this.age = 0;
        this.name = "";
        Student.strength += 1;
        // this (10, 20, "Ayush"); Calling another constructor inside a constructor
    }

    public Student(int rno, int age, String name) {
        this.rno = rno;
        this.age = age;
        this.name = name;
        Student.strength += 1;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object destroyed");
    }

    public static void details() {
        System.out.println("This class has 3 attributes");
    }
}

