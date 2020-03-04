package com.collections;

/**
 * Created by abhimanyunarwal on 3/4/20.
 * HackRank-Counting Triplets problem
 */

import java.io.IOException;
import java.util.*;

public class CountTriplets {

    // Complete the countTriplets function below.
    static long countTriplets(List<Long> arr, long r) {
        Map<Long, Long> leftMap = new HashMap<>();
        Map<Long, Long> rightMap = new HashMap<>();

        for (long item : arr) {
            if(rightMap.containsKey(item)){
                rightMap.put(item, rightMap.get(item)+1);
            }else{
                rightMap.put(item,0L+1);
            }
        }

        long count = 0;

        for (int i = 0; i < arr.size(); i++) {
            long midTerm = arr.get(i);
            long c1 = 0, c3 = 0;

            if(rightMap.containsKey(midTerm)){
                rightMap.put(midTerm, rightMap.get(midTerm)-1);
            } else{
                rightMap.put(midTerm,0L-1);
            }

            if (leftMap.containsKey(midTerm / r) && midTerm % r == 0) {
                c1 = leftMap.get(midTerm / r);
            }

            if (rightMap.containsKey(midTerm * r))
                c3 = rightMap.get(midTerm * r);

            count += c1 * c3;

            if(leftMap.containsKey(midTerm)){
                rightMap.put(midTerm, leftMap.get(midTerm)+1);
            } else{
                rightMap.put(midTerm,0L+1);
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long r = sc.nextLong();
        List<Long> arr = new ArrayList<>();
        while (n-- > 0) {
            arr.add(sc.nextLong());
        }

        long ans = countTriplets(arr, r);
        System.out.println(ans);

        sc.close();
    }
}
