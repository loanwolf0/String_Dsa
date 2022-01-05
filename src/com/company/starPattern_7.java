package com.company;

public class starPattern_7 {
    public static void main(String[] args) {
        int n = 5 ;
        pattern(n);

    }
    static void pattern(int n ){
        for (int row = 1; row <= n; row++) {

            int noOfSpaces = n - row;

            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col );

            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col);

            }System.out.println();

        }
    }
}
