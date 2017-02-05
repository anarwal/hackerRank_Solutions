package com.dataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by abhimanyunarwal on 2/5/17.
 * HackerRank: Running Medium-using bubble sort
 */
public class RunningMedianApproachOne {
    int capacity;

    public RunningMedianApproachOne(int capacity) {
        this.capacity = capacity;
    }

    List<Integer> aList = new ArrayList<>(capacity);

    public void lAdd(Integer element){
        if(capacity<=10000 && element <=10000) {
            aList.add(element);
            bubbleSort(aList);
            median(aList);
        }
    }

    public void bubbleSort(List<Integer> aList){
        int temp=0;
        for(int i=0; i<aList.size(); i++){ //compare by running two loops through array
            for(int j=1; j<aList.size()-1;j++){
                if(aList.get(j-1).compareTo(aList.get(j))>0){
                    temp=aList.get(j-1);
                    aList.set(j-1, aList.get(j));
                    aList.set(j, temp);
                }
            }
        }
    }

    public void median(List<Integer> aList){
        int sum=0;
       Integer first= aList.get(0);
       Integer last= aList.get(aList.size()-1);
        sum=first+last;
        double median = (sum/2.0);
        System.out.println(median);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        RunningMedianApproachOne sa=new RunningMedianApproachOne(n);
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
            sa.lAdd(a[a_i]);
        }
    }
}
