package com.practice;

import java.lang.reflect.Array;

/**
 * Created by abhimanyunarwal on 1/31/17.
 */
public class BinarySearch {



    public static int binarySearch(int[] arr, int element){
        int l=0;
        int r=arr.length-1;

       if(arr.length==0){
            System.out.println("Element not found, array null!");
            return 0;
        }

        while(l<=r){
            int middle =(l+r)/2;
            if(element==middle){
                return middle;
            }
            else if(element<arr[middle]){
                r=middle-1;
            }
            else{
                l=middle+1;
            }

        }
       return -1;
    }

    public static void main(String[] args) {
        int[] array={1,4,6,7,8,9};
        int element=4;
        int returnVale=BinarySearch.binarySearch(array,element);
        if(returnVale==-1){
            System.out.println("Element found");
        }
        else if(returnVale==0){
            System.out.println("Element not found");
        }

    }
}
