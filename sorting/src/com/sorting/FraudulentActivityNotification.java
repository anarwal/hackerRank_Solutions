package com.sorting;

import java.io.*;
import java.util.*;

public class FraudulentActivityNotification {

    // Complete the activityNotifications function below.
    static int activityNotifications(int[] expenditure, int d) {
        int counter =0;
        for(int i = d; i<expenditure.length-1; i++){
            List<Integer> alist = new ArrayList<>();
            for(int j=i-d; j<=i-1;j++){
                alist.add(expenditure[j]);
            }
            if( findMedian(alist)*2<= expenditure[i]){
                counter++;
            }
        }
        return counter;
    }


    public static double findMedian(List<Integer> alist)
    {
        Collections.sort(alist);
        if (alist.size()%2 == 1) {
            return (double)alist.get(alist.size()/2);
        }
        return (double)(alist.get(alist.size()/2)+alist.get((alist.size()/2)-1))/2;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] expenditure = new int[n];

        String[] expenditureItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int expenditureItem = Integer.parseInt(expenditureItems[i]);
            expenditure[i] = expenditureItem;
        }

        int result = activityNotifications(expenditure, d);

        System.out.println(result);

        scanner.close();
    }
}
