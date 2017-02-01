package com.practice;

/**
 * Created by abhimanyunarwal on 1/31/17.
 */
public class MergeSort {

    int[] array;
    int[] temp;
    int length;


    public static void mergeSort(int[] array) {
        System.out.println("length is" +array.length);
        doMerge(array, new int[array.length], 0, array.length-1);

    }

    public static void doMerge(int[] arr, int[] temp, int left, int right){
        if(left==right){
            return;
        }
        int middle=(left+right)/2;

        doMerge(arr, temp, left, middle);
        doMerge(arr, temp, middle+1, right);
        sort(arr, temp, left, right);
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
        int[] array={6,1,8,3,2, 8};
        mergeSort(array);
        for(int i=0;i<=array.length-1;i++){
            System.out.println(array[i]);
        }
    }


}
