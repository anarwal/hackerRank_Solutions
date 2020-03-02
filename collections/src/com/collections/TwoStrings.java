package com.collections;

/**
 * Created by abhimanyunarwal on 3/2/2020.
 * HackRank-Two Strings: Given two strings, determine if they share a common substring.
 */

import java.util.*;

public class TwoStrings {
    static String twoStrings(String s1, String s2) {
        char[] l1 = s1.toCharArray();
        char[] l2 = s2.toCharArray();

        HashMap<Character, Integer> hmap = new HashMap<>();
        for (char c1 : l1) {
            if(hmap.containsKey(c1)){
                hmap.put(c1, (hmap.get(c1))+1);
            }else{
                hmap.put(c1, 1);}
        }
        for(char c2 : l2){
            for (Map.Entry<Character, Integer> map: hmap.entrySet()) {
                if(map.getKey().equals(c2)){
                    return "YES";
                }
            }
        }
        return "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = scanner.nextLine();

            String s2 = scanner.nextLine();

            String result = twoStrings(s1, s2);
            System.out.println(result);
        }
        scanner.close();
    }
}
