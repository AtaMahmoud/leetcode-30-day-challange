package com.codewithata.weekfour;

public class MaximalSquare {
    public int maximalSquare(char[][] matrix) {
        if(matrix.length==0) return 0;
        int max = 0;
        int[][] r = new int[2][matrix[0].length];

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(i==0 || j==0){
                    r[1][j] = Character.getNumericValue(matrix[i][j]);
                }
                else if(matrix[i][j] == '1'){
                    int a = r[0][j];
                    int b = r[0][j-1];
                    int c = r[1][j-1];
                    int min = Math.min(a, Math.min(b,c));
                    r[1][j] = min+1;
                }
                max = Math.max(r[1][j], max);
            }
            for(int k=0; k<r[0].length; k++){
                r[0][k] = r[1][k];
                r[1][k] = 0;
            }
        }
        return max*max;
    }
}
