package me.dennyhz;
import java.util.Scanner;

public class writingLoopComments {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numImputs = 10;
        int input = 0;

        // This loop will be executed 10 times
        for (int i = 0; i < numImputs; i++) {
            input = scanner.nextInt(); // user inputs a number

            if (input % 2 == 0) { // if the number is even skip the
                continue;        // remaining code and restart the loop
            } // end if
            System.out.println("That number was odd");
        } // end for
    } // end method main
} // end class

