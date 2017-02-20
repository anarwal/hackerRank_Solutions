package com.random;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by abhimanyunarwal on 2/15/17.
 */
public class CustomSort {

    static void customSort(int[] arr) {

        Map<Integer,Integer> map = new HashMap<>();

        for(int n : arr) {
            if(map.containsKey(n)) {
                Integer  count = map.get(n);
                map.put(n, ++count);
            } else {
                map.put(n,1);
            }
        }

        final class FrequencyComparator implements Comparator<Integer> {
            Map<Integer,Integer> rMap;
            public FrequencyComparator(Map<Integer,Integer> base) {
                this.rMap = base;
            }

            @Override
            public int compare(Integer o1, Integer o2) {
                Integer val1 = rMap.get(o1);
                Integer val2 = rMap.get(o2);

                int num = val1.compareTo(val2)  ;
                // if frequencies are same then compare number itself
                return  num == 0 ? o1.compareTo(o2)   : num;
            }
        }

        FrequencyComparator comp = new FrequencyComparator(map);
        TreeMap<Integer,Integer> sMap = new TreeMap<Integer,Integer>(comp);
        sMap.putAll(map);
        for(Integer i : sMap.keySet()) {
            int fre = sMap.get(i);
            for(int c  = 1 ; c <= fre ; c++) {
                System.out.println(i + " " );
            }
        }

    }
}
