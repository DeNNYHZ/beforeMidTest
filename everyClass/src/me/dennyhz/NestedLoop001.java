package me.dennyhz;

public class NestedLoop001 {
    public static void main(String[] args) {
        for(int i = 1; i < 10; i++) {
            for(int j = 1; j < i; j++) {
                System.out.println("*");
            }
        }
        System.out.println("");
    }
}
