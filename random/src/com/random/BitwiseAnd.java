package com.random;

import java.util.Scanner;

/**
 * Created by abhimanyunarwal on 3/7/17.
 */
public class BitwiseAnd {

    public static int maxVal(int n, int k){
        int[] arr = new int[n];
        int num=0;
        for(int i=1;i<=n-1;i++){
            for(int j=i+1;j<=n;j++){
                if((i&j)<k){
                    arr[i]=(i&j);
                    num = Math.max(num, arr[i]);
                }
            }
        }
      return num;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            System.out.println(maxVal(n,k));
        }
    }
}
