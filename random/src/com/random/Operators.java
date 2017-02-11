package com.random;

/**
 * Created by abhimanyunarwal on 2/9/17.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Operators {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        String ans="";

        // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
        if(n%2==1){
            ans = "Weird";
        }
        else if (n%2==0 && 2<=n && n<=5){
            ans = "Not Weird";
        }
        else if(n%2==0 && 6<=n && n<=20){
            ans = "Weird";
        }
        else if(n%2==0 && n>20){
            ans = "Not Weird";

        }
        System.out.println(ans);
    }
}

