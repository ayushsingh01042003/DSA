import java.io.InputStream;

class Test {
    public static void main(String[] args) {
        // take input from user and print it using InputStream
        InputStream is = System.in;
        System.out.println("Enter some text: ");
        try {
            int i = 0;
            while ((i = is.read()) != 10) {
                // System.out.print(i);
                System.out.print((char) i +" "+ i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}