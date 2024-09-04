package Math;

class Math {
    public Math() {
        
    }
    int secret = 10;
    public static void main(String[] args) {
        int num = 10;

        //Right Shift operator makes (1010) -> (0101) i.e. 5
        //Right Shift = num / (2 ^ rightshift)
        System.out.println(num >> 2);

        //Left Shift operator makes (1010) -> (101000)
        //Left Shift = num * (2 ^ leftshift)
        System.out.println(num << 2);

        //A ^ A = 0
        //A ^ 0 = A
    }
}                       