package com.company;

public class starPattern_4 {
    public static void main(String[] args) {
        int n = 4;
        starPatter(n);

    }
    // method 1

    static void starPattern(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    // method 2

    static void starPatter(int n) {
        for (int row = 1; row <= n; row++) {
            int i = 1;
            for (int col = 1; col <= row; col++) {
                System.out.print(i + " ");
                i++;
            }
            System.out.println();
        }
    }
}
