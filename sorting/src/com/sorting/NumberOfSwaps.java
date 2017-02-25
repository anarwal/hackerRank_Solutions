package com.sorting;

import java.util.Scanner;

/**
 * Created by abhimanyunarwal on 2/23/17.
 */
public class NumberOfSwaps {
    public static long counter;

    public static long numberSwaps(int[] array){
        int temp=0;
        for(int i=0; i<array.length;i++){
            for(int j=i+1; j<array.length;j++){
                if(array[j-1]>array[j]){
                    temp=array[j-1];
                    array[j-1]=array[j];
                    array[j]=temp;
                    counter++;
                }
            }
        }
        return counter;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int arr[] = new int[n];
            for(int arr_i=0; arr_i < n; arr_i++){
                arr[arr_i] = in.nextInt();
            }

            System.out.println(numberSwaps(arr));
        }

    }


}
