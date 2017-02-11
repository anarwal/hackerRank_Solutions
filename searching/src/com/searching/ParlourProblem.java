package com.searching;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ParlourProblem {

    public static String searchCombo(int total, int array[]) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < array.length; i++) {
            int id = i + 1;
            int cost = total - array[i];
            if (map.containsKey(cost)) {
                return (array[i] + " " + map.get(cost));
            } else {
                map.put(array[i], id);
            }
        }
        return null;
    }

//        public static boolean searchCombo(int total, int array[]) {
//            Set<Integer> hs = new LinkedHashSet<Integer>();
//            for (int i = 0; i < array.length; i++) {
//                if (hs.contains(array[i])) {
//                    return true;
//                } else {
//                   hs.add(total-array[i]);
//                }
//            }
//            return false;
//        }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int m = in.nextInt();
            int n = in.nextInt();
            int a[] = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            System.out.println(searchCombo(m, a));
        }

    }
}

