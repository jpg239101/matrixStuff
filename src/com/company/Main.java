package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int [][] a = new int[3][4];
        int [][] b = new int[4][2];
        a[][] = { {3, 9, 2, 1},

                {5, 7, 6, 0} };

        int b[][] = { {0, 2, 8, 4},

                {3, 9, 2, 1} };




       int [][] done = MatrixMult.muti(a,b);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++)
                System.out.print(done[i][j] + " ");
            System.out.println();
        }

    }
}
