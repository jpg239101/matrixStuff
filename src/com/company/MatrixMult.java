package com.company;

/**
 * Created by jg101 on 12/21/16.
 */
public class MatrixMult {

    public static int[][] muti(int [][] c, int [][] d){
        int r = 0;
        if (c.length < d.length) {
            r = c.length;
        }
        else {
            r = d.length;
        }
        int aColumns = c[0].length;
        int bColumns = d[0].length;

        int [][] product = new int[r][2];
        for (int i = 0; i < r; i++) { // aRow
            for (int j = 0; j < bColumns; j++) { // bColumn
                for (int k = 0; k < aColumns; k++) { // aColumn
                    product[i][j] += c[i][k] * d[k][j];
                }
            }
        }




        return product;
    }
}
