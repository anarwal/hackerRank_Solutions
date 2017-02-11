package com.random;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by abhimanyunarwal on 2/11/17.
 */
public class BitManipulation {

    public static void numberReturn(int[] arr){
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }else{ int counter = map.get(arr[i]);
                map.put(arr[i], counter+1);
            }
        }for(int key : map.keySet()){
            int num=map.get(key);

            if(num==1){
                System.out.println(key);}
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        numberReturn(a);
    }

}
