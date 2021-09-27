package me.dennyhz;
import java.util.Scanner;

public class Loop01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        do{
            i++;
            System.out.println(i);
            System.out.println("Ini baris ke 2");
            if(i%2 == 0) {
                continue;
            }
            System.out.println("Ini baris ke 3");
        } while(i<10);
        System.out.println("Ini baris diluar do-while");
    }
}
