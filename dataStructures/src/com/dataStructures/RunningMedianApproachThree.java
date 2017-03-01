package com.dataStructures;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Created by abhimanyunarwal on 2/5/17.
 * HackerRank: Running Median
 */
public class RunningMedianApproachThree {

    //This is the minHeap
    private static PriorityQueue<Integer> lHeap = new PriorityQueue<>();                           // keeps track of the LARGE numbers


    //This is the maxHeap
    private static PriorityQueue<Integer> sHeap = new PriorityQueue<>(Collections.reverseOrder()); // keeps track of the SMALL numbers

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        medianTracker(a);
    }

    public static void medianTracker(int [] array) {
        for (int i = 0; i < array.length; i++) {
            addNumber(array[i]);
            System.out.println(getMedian());
        }
    }

    private static void addNumber(int num) {
        if (sHeap.isEmpty()) {
            sHeap.add(num);
        }
        else if (sHeap.size() == lHeap.size()) {
            if (num > sHeap.peek()) {
                lHeap.add(num);
                sHeap.add(lHeap.remove());
            }
            else {
                sHeap.add(num);
            }
        }
        else if (sHeap.size() > lHeap.size()) {
            if (num > sHeap.peek()) {
                lHeap.add(num);
            }
            else {
                sHeap.add(num);
                lHeap.add(sHeap.remove());
            }
        }
        // Note: sHeap will never be smaller size than lHeap
    }

    private static double getMedian() { // problem statement said: will always have at least 1 element
        if (sHeap.size() > lHeap.size()) {
            return sHeap.peek();
        }
        else { // same size
            return (sHeap.peek() + lHeap.peek()) / 2.0;
        }
    }
}
