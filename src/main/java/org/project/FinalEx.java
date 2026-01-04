package org.project;

public class FinalEx {
    final int speedLimit = 90;
    void run() {
       //  speedLimit = 400; // Compile-time error: cannot assign a value to final variable speedLimit
        System.out.println("Speed Limit: " + speedLimit);
    }

    public static void main(String[] args) {
        FinalEx obj = new FinalEx();
        obj.run();
    }
}
