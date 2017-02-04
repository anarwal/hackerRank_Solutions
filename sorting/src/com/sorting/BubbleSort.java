package com.sorting;

import java.util.Scanner;

/**
 * Created by abhimanyunarwal on 1/30/17.
 * Perform bubble sort on given array
 * time complexity: n^2
 */

class BubbleSort{
    private static void bubbleSort(int a[]){
        int temp=0;
        for(int i=0; i<a.length; i++){ //compare by running two loops through array
            for(int j=1; j<a.length-1;j++){
                if(a[j-1]>a[j]){
                    temp=a[j-1];
                    a[j-1]=a[j];
                    a[j]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements you want?");
        int n = scanner.nextInt();
       int[] array = new int[n];
        System.out.println("Enter the elements");
        for (int k = 0; k <= n - 1; k++) {
            array[k]= scanner.nextInt();
        }

        System.out.print("Sorted Numbers are: ");
        BubbleSort.bubbleSort(array);
        for(int l=0; l<array.length;l++){
            System.out.print(" " +array[l]);
        }

    }
}