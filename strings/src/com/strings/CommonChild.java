package com.strings;

import java.util.Scanner;

/**
 * Created by abhimanyunarwal on 2/27/20.
 * HackerRank: Common Child Program
 */

public class CommonChild {
    static int commonChild(String s1, String s2) {
      return LCS(s1.toCharArray(), s2.toCharArray(),s1.length(),s2.length());
    }

    static int LCS(char[] s1, char[] s2, int i, int j){
        int[] memo = new int[j+1];

        for(int m=1;m<= i; m++){
            int prev =0;
            for(int n=1; n<= j; n++){
                int temp = memo[n];
                if(s1[m-1] == s2[n-1]){
                    memo[n] = prev+1;
                }else{
                    memo[n] = Math.max(memo[n],memo[n-1]);
                }
                prev =temp;
            }
        }
        return memo[j];
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();

        int result = commonChild(s1, s2);

        System.out.println(result);
        scanner.close();
    }
}

