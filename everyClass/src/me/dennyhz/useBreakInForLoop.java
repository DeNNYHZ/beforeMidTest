package me.dennyhz;
import java.util.Scanner;

public class useBreakInForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numImputs = 10;
        int input = 0;
        int sum = 0;
        int stopLoop = 999;
        System.out.println("Enter 10 numbers");
        for(int i = 0; i < numImputs; i++) {
            input = scanner.nextInt();
            if(input == stopLoop) {
                break;
            }
            else {
                sum += input;
            }
        }
        System.out.println("The sum of the numbers: "+ sum);
    }
}
