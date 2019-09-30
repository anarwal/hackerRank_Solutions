package com.arrays;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by abhimanyunarwal on 9/29/2019.
 * HackRank-2D array - hourglass problem
 */


public class TwoDArray {

    static int hourglassSum(int[][] arr) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i <6; i++){
            for (int j=0;j <6; j++){
                if ((i + 2) < 6 && (j + 2) < 6) {
                    sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j]
                            + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                }
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }

        }
        return maxSum;
    }


    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int [6][6];
        for (int i =0;i<6;i++){
            for (int j=0;j<6;j++){
                arr[i][j] = in.nextInt();
            }
        }

        int result = hourglassSum(arr);
        System.out.println("Printing max sum " + result);
    }
}
