package com.sorting;

import java.io.*;
import java.util.*;

/**
 * Created by abhimanyunarwal on 2/6/17.
 * HackerRank-Bubble Sort
 */
public class BubbleSortHack {
    int[] array;

    public BubbleSortHack(int[] array) {
        this.array = array;
    }

    public void sort() {
        int numberOfSwaps = 0;
        for (int i = 0; i < array.length; i++) {
            int temp=0;
            for (int j = 1; j < array.length; j++) {
                if (array[j-1] >array[j]) {
                    temp=array[j-1];
                    array[j-1]=array[j];
                    array[j]=temp;
                    numberOfSwaps++;
                }
            }
            // If no elements were swapped during a traversal, array is sorted
            if (numberOfSwaps == 0) {
                break;
            }
        }
        System.out.println("Array is sorted in " +numberOfSwaps+ " swaps.");
        System.out.println("First Element:" +array[0]);
        System.out.println("Last Element"+ array[array.length-1]);;
    }


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        BubbleSortHack bsh = new BubbleSortHack(array);
        bsh.sort();


    }
}
