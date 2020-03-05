package com.sorting;

/**
 * Created by abhimanyunarwal on 3/4/20.
 * HackerRank-Mark and Toys using collections.sort
 */

import java.util.*;

public class MarkAndToys {

    // Complete the maximumToys function below.
    static int maximumToys(int[] prices, int k) {
        int count =0;
        List<Integer> alist = new ArrayList<>();
        for(Integer i:prices) {
            alist.add(i);
        }
        Collections.sort(alist);
        int i =0;
        while (k>0 && alist.get(i)<k) {
            k = k - alist.get(i);
            i++;
            count++;
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] prices = new int[n];

        String[] pricesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int pricesItem = Integer.parseInt(pricesItems[i]);
            prices[i] = pricesItem;
        }

        int result = maximumToys(prices, k);

        System.out.println(result);

        scanner.close();
    }
}
