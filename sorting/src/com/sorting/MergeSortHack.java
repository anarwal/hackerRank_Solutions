package com.sorting;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by abhimanyunarwal on 2/8/17.
 */
public class MergeSortHack {
    static int counter=0;

    public static int mergeSort(int[] array){
        merge(array, new int[array.length-1], 0, array.length-1);
        return counter;
    }

    public static void merge(int[] arr, int[] temp, int left, int right){
        if(left==right){return;}

        int middle=(left+right)/2;

        merge(arr, temp, left, middle);
        merge(arr, temp, middle+1, right);
        sort(arr, temp, left, middle);
    }

    public static void sort(int[] a, int[] temp, int lStart, int rEnd){

        int lEnd=(rEnd+lStart)/2;
        int rStart=lEnd+1;
        int size=rEnd-lStart+1;

        int left=lStart;
        int right=rStart;
        int index=lStart;
        while(left<=lEnd &&right<=rEnd){
            if(a[left]<a[right]){
                temp[index]=a[left];
                left++;
            }
            else{
                counter +=right-left;
                temp[index]=a[right];
                right++;
            }
            index++;
        }

        System.arraycopy(a, left, temp, index, lEnd-left+1);
        System.arraycopy(a, right, temp, index, rEnd-right+1);
        System.arraycopy(temp, lStart, a, lStart, size);
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

            System.out.println(mergeSort(arr));
            System.out.println(arr);
        }

    }
}
