package com.dataStructures;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by abhimanyunarwal on 2/5/17.
 * HackerRank: Running Median---doesnt work
 */
public class RunningMedianApproachTwo {

   public static double[] getMedians(int[] array){
       PriorityQueue<Integer> lHeap = new PriorityQueue<>(new Comparator<Integer>() {
           public int compare(Integer a,Integer b) {return -1 * a.compareTo(b);}});
       PriorityQueue<Integer>  hHeap = new PriorityQueue<Integer>();
       double[] medians =new double[array.length];
       for(int i=0; i<array.length;i++){
           int number = array[i];
           addNumber(number, lHeap, hHeap);
           reBalance(lHeap, hHeap);
           medians[i]=getMedian(lHeap, hHeap);
           System.out.println(medians[i]);
       }
       return medians;
   }

    private static double getMedian(PriorityQueue<Integer> lHeap, PriorityQueue<Integer> hHeap) {
        PriorityQueue<Integer> biggerHeap =lHeap.size() >hHeap.size() ? lHeap:hHeap;
        PriorityQueue<Integer> smallerHeap=lHeap.size()<hHeap.size() ?hHeap:lHeap;

        if(biggerHeap.size()==smallerHeap.size()){
            return ((double)biggerHeap.peek() +smallerHeap.peek())/2;
        }else{
            return biggerHeap.peek();
        }

   }

    private static void reBalance(PriorityQueue<Integer> lHeap, PriorityQueue<Integer> hHeap) {
      PriorityQueue<Integer> biggerHeap =lHeap.size() >hHeap.size() ? lHeap:hHeap;
      PriorityQueue<Integer> smallerHeap=lHeap.size()<hHeap.size() ?hHeap:lHeap;
      if (biggerHeap.size() -smallerHeap.size() >=2){
          smallerHeap.add(biggerHeap.poll());
      }
    }

    public static void addNumber(int number, PriorityQueue<Integer>lHeap, PriorityQueue<Integer>hHeap){
       if(lHeap.size() == 0 || number <lHeap.peek()){
           lHeap.add(number);
       }else{
           hHeap.add(number);
       }
   }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        System.out.println(getMedians(a));
    }
}

