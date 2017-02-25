package com.random;

import java.util.*;

/**
 * Created by abhimanyunarwal on 2/25/17.
 */
public class MaximumHourGlass {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int arr[][] = new int[6][6];
            for(int i=0; i < 6; i++){
                for(int j=0; j < 6; j++){
                    arr[i][j] = in.nextInt();
                }
            }
            in.close();
            System.out.println(maxHourglass(arr));
        }

        //As maxHourGlass is always going to have 3X3 matrix, so it is safe to take 3 rows and 3 columsn
        public static int maxHourglass(int [][] arr) {
            int max = Integer.MIN_VALUE;
            for (int row = 0; row <=3; row++) {
                for (int col = 0; col <=3; col++) {
                    int sum = findSum(arr, row, col);
                    max = Math.max(max, sum);
                }
            }
            return max;
        }

        /*for finding sum of maxhourglass, the formation needs to be
           E E E
           0 E 0
           E E E
           this is how findSum adds
        */
        private static int findSum(int [][] arr, int r, int c) {
            int sum = arr[r+0][c+0] + arr[r+0][c+1] + arr[r+0][c+2]
                    + arr[r+1][c+1] +
                    arr[r+2][c+0] + arr[r+2][c+1] + arr[r+2][c+2];
            return sum;
        }
}

