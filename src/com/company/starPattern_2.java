package com.company;

public class starPattern_2 {
    public static void main(String[] args) {
        int n = 4;
        starPattern(n);

    }
    static  void starPattern ( int n ){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <=n; col++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}
