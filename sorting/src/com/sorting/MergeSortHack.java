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
    private static long counter=0;

    public static long mergeSort(int[] array){
        counter=0;
        merge(array, new int[array.length], 0, array.length-1);
        return counter;
    }

    public static void merge(int[] arr, int[] temp, int left, int right){
        if(left==right){return;}

        int middle=(left+right)/2;

        merge(arr, temp, left, middle);
        merge(arr, temp, middle+1, right);
        sort(arr, temp, left,middle, right);
    }

    public static void sort(int[] a, int[] temp, int lStart, int middle, int rEnd){

        for(int i=lStart; i<=rEnd; i++){
            temp[i]=a[i];
        }

        int curr=lStart;
        int left=lStart;
        int right=middle+1;

        while(left<=middle && right<=rEnd){
            if(temp[left]<=temp[right]){
                a[curr]=temp[left];
                curr++;
                left++;
            }else{

                a[curr]=temp[right];
                curr++;
                right++;
                counter += middle+1 - left;
            }
        }
        while(left <= middle){
            a[curr] = temp[left];
            curr++;
            left++;
        }
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
        }

    }
}
