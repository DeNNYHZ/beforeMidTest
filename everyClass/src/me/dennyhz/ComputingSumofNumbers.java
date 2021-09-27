package me.dennyhz;

public class ComputingSumofNumbers {
    public static void main(String[] args) {
        int counter = 0;
        int sum = 0;
        while(counter < 100) {
            counter++;
            if (counter % 10 == 0) {
                continue;
            } else {
                sum += counter;
            } // end if
        } // end while
        System.out.println("Sum of 1 - 99: " +sum);
    } // end method main
} // end class
