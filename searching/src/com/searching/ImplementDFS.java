package com.searching;

import java.util.*;

public class ImplementDFS {

    private static int rows;
    private static int cols;


    public static int findBiggestRegion(int[][] grid){

        int maxRegion=0;

        for(int row =0; row<rows;row++){
            for(int col=0; col<cols;col++){
                if(grid[row][col] ==1){
                    int size= findRegion(grid, row, col);
                    maxRegion = Math.max(maxRegion, size);
                }
            }
        }
        return maxRegion;
    }

    //Method to find the biggest Available area, input will be the grid,
    private static int findRegion(int[][] grid, int row, int col){
        if(row<0 ||row>=rows || col<0 || col>=cols){return 0;}
        else if(grid[row][col]==0){return 0;}
        grid[row][col]=0;
        int size=1;
        for(int r = row-1; r<= row+1; r++){
            for(int c= col-1;c<=col+1;c++) {
                if (!(r == 0 && c == 0)) {
                    size += findRegion(grid, r, c);
                }
            }
        }
        return size;

    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        rows = in.nextInt();
        cols = in.nextInt();
        int grid[][] = new int[rows][cols];
        for(int grid_i=0; grid_i < rows; grid_i++){
            for(int grid_j=0; grid_j < cols; grid_j++){
                grid[grid_i][grid_j] = in.nextInt();
            }
        }
        in.close();
        System.out.println(findBiggestRegion(grid));
    }
}

