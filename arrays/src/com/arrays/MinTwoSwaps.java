package com.arrays;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by abhimanyunarwal on 2/25/2020.
 * HackRank-Minimum Swaps 2 problem
 */


public class MinTwoSwaps {

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
        int counter =0;
        for(int i =0; i<arr.length-1; i++){
            int j = minElementPos(i,arr);
            int temp;
            if(arr[i]>arr[j]){
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                counter++;
            }
        }
        return counter;

    }

    static int minElementPos(int startingelement, int[] arr){
        int first, arr_size = arr.length;
        int index=0;
        first = Integer.MAX_VALUE;
        for(int i=startingelement; i<arr_size;i++){
            if (arr[i] < first)
            {
                first = arr[i];
                index = i;
            }
        }
        return index;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = minimumSwaps(arr);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
