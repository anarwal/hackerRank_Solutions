package com.strings;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by abhimanyunarwal on 2/28/20.
 * HackerRank: Special String Palindrome program
 */

public class SpecialString {
    static long substrCount(int n, String s) {
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                if (checkPalindrome(s.substring(i, j))) {
                    counter++;
                }
            }
        }
        return counter;
    }

    static boolean checkPalindrome(String s) {
        String reverse = new StringBuffer(s).reverse().toString();
        if (s.equals(reverse)) {
            char[] ch = reverse.toCharArray();
            HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
            for (char c : ch) {
                if (hmap.containsKey(c)) {
                    hmap.put(c, hmap.get(c) + 1);
                } else {
                    hmap.put(c, 1);
                }
            }
            if (hmap.size() <= 2) {
                return true;
            }
        }
        return false;
    }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main (String[]args) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            String s = scanner.nextLine();
            long result = substrCount(n, s);
            System.out.println(result);
            scanner.close();
        }
    }

