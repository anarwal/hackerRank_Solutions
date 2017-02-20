package com.random;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LetsReviewProblem {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int n= scan.nextInt();
        for(int i=0; i<n; i++){
            String s = scan.next();
            printSeperated(s);
        }
    }

    public static void printSeperated(String str){
        char[] ch= str.toCharArray();
        List<Character> list1 = new ArrayList<>();
        List<Character> list2 = new ArrayList<>();
        for(int i=0; i<ch.length; i++){
            if (i%2==0){
               list1.add(ch[i]);
            }
            else{
                list2.add(ch[i]);
            }
        }

        String s1 = list1.toString().replaceAll("[,\\s\\[\\]]", "");
        String s2 = list2.toString().replaceAll("[,\\s\\[\\]]", "");
        System.out.println(s1+s2);

    }
}