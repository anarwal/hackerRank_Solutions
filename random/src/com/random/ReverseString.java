package com.random;

import java.util.Scanner;

/**
 * Created by abhimanyunarwal on 2/12/17.
 * String Reversal
 */
public class ReverseString {

    public static void reverse(String str){
        char[] ch= str.toCharArray();
        StringBuilder sb= new StringBuilder();
        sb.append(str);
        sb.reverse();
        System.out.println(sb);

//        char[] chr=new char[ch.length];
        for(int i=ch.length-1; i>=0;i--){
            System.out.print(ch[i]);
            }
    }

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String str=scan.next();
        reverse(str);
    }
}
