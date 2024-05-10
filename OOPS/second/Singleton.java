package OOPS.second; 

//Singleton class can create only one object
public class Singleton {
    private Singleton() {}

    private static Singleton obj;

    public static Singleton getInstance() {
        if(obj == null) {
            obj = new Singleton();
        }

        return obj;
    }
}