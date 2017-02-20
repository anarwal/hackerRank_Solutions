package com.random;

import java.util.Scanner;

/**
 * Created by abhimanyunarwal on 2/19/17.
 */
public class ReverseNums {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        reverseNumbers(arr);
        in.close();
    }


    public static void reverseNumbers(int[] arr){
        for(int i=arr.length; i>0;i--){
            System.out.println(arr[i]+" ");
        }
    }

}
