package com.company;

public class starPattern_9 {
    public static void main(String[] args) {
        int n =5;
        System.out.println(n);
        pattern(n);
    }

    static void pattern(int n) {
        for (int row = 0; row <= n-1; row++) {
            int numberOfSpaces = row * 2;
            int totalColumnToPrint = n - numberOfSpaces +row ;

            for (int col = 1; col <= totalColumnToPrint; col++) {
                System.out.print("*");
            }
            for (int printSpaces = totalColumnToPrint+2; printSpaces  <= n+row+1; printSpaces++) {
                System.out.print(" ");

            }
            for (int col2 = n+row+1; col2 <= 2*n; col2++) {
                System.out.print("*");

            }



            System.out.println();
        }
    }
}
