package com.arrays;

import java.io.*;
import java.util.*;

/**
 * Created by abhimanyunarwal on 2/26/2020.
 * HackRank-Array Manipulation problem
 */


public class ArrayManipulation {

    // Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] queries) {
        long[] outputarray = new long[n + 2];
        for (int i = 0; i < queries.length; i++) {
            int a = queries[i][0];
            int b = queries[i][1];
            int k = queries[i][2];
            outputarray[a] = outputarray[a] + k;
            outputarray[b + 1] = outputarray[b + 1] - k;
        }
        long max = maxElement(outputarray);
        return max;
    }

    static long maxElement(long[] arr) {
        long maxElement = arr[0];
        long sum = 0;
        for (int i = 1; i < arr.length; i++) {
            sum = sum + arr[i];
            if (sum > maxElement) {
                maxElement = sum;
            }
        }
        return maxElement;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[][] queries = new int[m][3];

        for (int i = 0; i < m; i++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowItems[j]);
                queries[i][j] = queriesItem;
            }
        }

        long result = arrayManipulation(n, queries);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
