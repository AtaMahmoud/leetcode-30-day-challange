package com.codewithata.weekthree;

public class MinimumPathSum {
    public int minPathSum(int[][] grid) {
        for (int i = 0; i < grid.length; i++)
            for (int j = 0; j < grid[0].length; j++){
                if(i==0&&j==0)continue;
                grid[i][j] += Math.min(getPossibleCell(grid, i , j- 1)
                        , getPossibleCell(grid, i- 1, j ));
            }

        return grid[grid.length - 1][grid[0].length - 1];
    }

    private int getPossibleCell(int[][] grid, int i, int j) {
        if (i >= 0 && i < grid.length && j >= 0 && j < grid[i].length)
            return grid[i][j];

        return Integer.MAX_VALUE;
    }
}
