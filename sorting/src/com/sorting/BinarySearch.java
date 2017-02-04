package com.sorting;


/**
 * Created by abhimanyunarwal on 1/31/17.
 * time complexity: logn
 */
public class BinarySearch {

    //method to perform binary search
    public static int binarySearch(int[] arr, int element){
        int l=0;
        int r=arr.length-1;

       if(arr.length==0){
            System.out.println("Element not found, array null!");
            return 0;
        }

        //search the element in given array
        while(l<=r){
            int middle =(l+r)/2; //divide array in half and perform search in each halves
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
