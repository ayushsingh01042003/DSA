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

        // the 2 ^ 31 bit or the last bit stores 0 -> +ve or 1 -> -ve
        // To store -ve of a number computer stores its 2's complement 
        // 2's complement is 1's complement(flip all bits) + 1 (in binary addition 0 + 1 = 1 and 1 + 1 = 1 (with carry 1))
        // This means -ve binary system is completely different
        // !5 computer stores -6 and !(-6) computer stores 5
    }
}                       