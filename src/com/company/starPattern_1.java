package com.company;

public class starPattern_1 {
    public static void main(String[] args) {
        int n = 4;
        starPattern(n);

    }
    static  void starPattern ( int n ){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <=row; col++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}
