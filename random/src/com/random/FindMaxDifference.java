package com.random;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 * Created by abhimanyunarwal on 2/20/17.
 */
public class FindMaxDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}


class Difference {
    private int[] elements;
    public int maximumDifference;


    public Difference(int[] elements) {
        this.elements = elements;
    }

    public int computeDifference(){
        maximumDifference=0;
        int diff=0;
        for(int i=0; i<elements.length; i++){
            for (int j=0;j<elements.length;j++){
                diff=Math.abs(elements[j]-elements[i]);
                maximumDifference=Math.max(diff, maximumDifference);
            }

        }
        return maximumDifference;
    }
}

