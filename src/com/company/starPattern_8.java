package com.company;

public class starPattern_8 {
    public static void main(String[] args) {
        int n = 5;
        pattern(n);

    }

    static void pattern(int n) {
        for (int row = 1; row <= 2*n-1; row++) {
            int totalNUmberOfColumn = row > n ? 2*n-row : row;

            int noOfSpaces = n -totalNUmberOfColumn ;

            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }

            for (int col = totalNUmberOfColumn; col >= 1; col--) {
                System.out.print(col);
            }
            for (int col = 2; col <= totalNUmberOfColumn; col++) {
                System.out.print(col);
            }
            System.out.println();

        }
    }
}
