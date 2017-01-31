package com.practice;

/**
 * Created by abhimanyunarwal on 1/31/17.
 */
import java.util.*;

public class QuickSort {

    public int a[];
    public int length;

    private void swap(int i, int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }

    private void quicksort(int low, int high){
        int i=low;
        int j=high;
        int pivot=a[(low+high)/2];
        while(i<=j) {

            while (a[i] < pivot) {
                i++;
            }
            while (pivot < a[j]) {
                j--;
            }
            if (i <= j) {
                swap(i, j);
                i++;
                j--;
            }
        }
            if (low < j) {
                quicksort(low, j);
            }
            if (i > high) {
                quicksort(i, high);
            }


    }

    public void sort(int[] inputArr){
        if (inputArr == null || inputArr.length == 0) {
            return;
        }
        this.a = inputArr;
        length = inputArr.length;
        quicksort(0, length - 1);

    }

    public static void main(String[] args){
        QuickSort sorter= new QuickSort();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements you want?");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements");
        for(int k = 0; k <= n - 1; k++) {
            array[k]= scanner.nextInt();
        }
        System.out.print("Sorted Numbers are: ");
        sorter.sort(array);
        for(int l=0; l<array.length;l++){
            System.out.print(" " +array[l]);
        }
    }

}