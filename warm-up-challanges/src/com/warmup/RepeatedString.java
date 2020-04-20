package com.warmup;

import java.util.Scanner;

public class RepeatedString {

    public static long getLetterCount(String word, long length) {
        long count = 0;
        for (int i = 0; i < length; i++) {
            if (word.charAt(i) == 'a')
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int l = word.length();
        long freq = sc.nextLong();
        long q = 0, r = 0;
        q = freq / l;
        r = freq % l;
        long length = (r == 0) ? 0 : r;
        long c1 = getLetterCount(word, word.length());
        long c2 = getLetterCount(word, length);
        long aCount = q * c1 + c2;
        System.out.println(aCount);
        sc.close();
    }

}
