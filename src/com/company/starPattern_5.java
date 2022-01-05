package com.company;

public class starPattern_5 {
    public static void main(String[] args) {
        int n =5;
        pattern(n);
    }

    // method 1

    static  void starPattern ( int n ){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <=row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int row = 1; row <=n; row++) {
            for (int col = 1; col <=n-row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // method 2

    static void pattern( int n){
        for (int row = 0; row < 2 * n; row++) {
            int totalColsInRow = row > n ? 2 * n - row : row;
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}