package com.random;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by abhimanyunarwal on 2/19/17.
 */
public class ConsecOnes {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        consecOnes(n);
    }

    public static void consecOnes(int num){
        String bNum=Integer.toBinaryString(num);
        String[] strArray=bNum.split("");
        int maxL=0;
        int temp=0;
            for (int i = 0; i < strArray.length; i++) {
                if (strArray[i].equals("1")) {
                    temp++;
                    maxL = Math.max(maxL, temp);
                } else {
                    temp = 0;
                }
            }
        System.out.println(maxL);
    }
}

