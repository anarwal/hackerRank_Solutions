package com.warmup;

/**
 * Created by abhimanyunarwal on 9/29/2019.
 * HackRank-Sock Merchant problem
 */

import java.io.*;
import java.util.*;

public class SockMerchant {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {

        HashMap<Integer, Integer> hmap= new HashMap<>();
        for (int i=0; i< ar.length; i++){
            if(hmap.containsKey(ar[i]))
                hmap.put(ar[i],hmap.get(ar[i]) + 1);
            else
                hmap.put(ar[i], 1);
        }
        int finalcount=0;
        for(Integer j : hmap.keySet()){
            if(hmap.get(j) >= 2){
                finalcount += hmap.get(j)/2;
            }
        }
        return finalcount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :: ");
        int n = sc.nextInt();
        int ar[] = new int[n];
        System.out.println("Enter elements of the array (Strings) :: ");
        for(int i=0; i<n; i++) {
            ar[i] = Integer.valueOf(sc.next());
        }
        System.out.println("Printing arrays: " + Arrays.toString(ar));
        sockMerchant(n,ar);
    }
}