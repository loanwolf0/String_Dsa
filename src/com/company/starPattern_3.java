package com.company;

public class starPattern_3 {
    public static void main(String[] args) {
        int n = 5;
        starPatter(n);

    }
    // method 1

    static  void starPattern ( int n ){
        for (int row = n; row >= 1; row--) {
            for (int col = n; col >=n-row; col--) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
    // method 2

    static  void starPatter ( int n ){
        for (int row = 1; row <=n; row++) {
            for (int col = 1; col <=n-row+1; col++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }


}
