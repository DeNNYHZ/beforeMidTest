package me.dennyhz;

public class Main {

    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.print(i + "\t");
            i++;
            if (i == 4) {
                break;
            }
        }
    }
}