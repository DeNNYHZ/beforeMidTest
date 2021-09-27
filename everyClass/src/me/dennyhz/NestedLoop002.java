package me.dennyhz;

public class NestedLoop002 {
    public static void main(String[] args) {
        for(int jam = 0; jam < 24; jam++) {
            System.out.println("Jam :" +jam);
            for(int menit = 0; menit < 60; menit++) {
                System.out.println("Menit :" +menit);
                for (int detik = 0; detik < 60; detik++) {
                    System.out.println("Detik :" +detik);
                }
            }
        }
    }
}
