package OOPS.second;

import OOPS.first.Student;

public class Test {
    public static void main(String[] args) {
        Student.details();
    }

    static void function1() {
        System.out.println("Function 1");
    }
}

// class OuterClass {
//     int x = 10;
//     class InnerClass {
//         int y = 20;
//     }
// }

//static function does not take non static functions because, non static means that function belongs to some object 
//but static does not need an object, hence cannot run non-static inside static.