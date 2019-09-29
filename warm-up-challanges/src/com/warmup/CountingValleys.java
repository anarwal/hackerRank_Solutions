package com.warmup;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by abhimanyunarwal on 9/29/2019.
 * HackRank-Counting Valley problem
 */

public class CountingValleys {

    static int countingValleys(int n, String s) {
        int finalValleyCount = 0;
        int altitude =0;
        for(int i =0; i<n; i++){
            char ch = s.charAt(i);
            if(ch == 'U'){
                altitude++;
                if (altitude == 0){
                    finalValleyCount++;
                }
            }
            else{altitude--;}
        }
        return finalValleyCount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of steps Gary takes :: ");
        int n = sc.nextInt();
        System.out.println("Enter a string describing his path :: ");
        String s = scanner.nextLine();
        Integer result = countingValleys(n,s);
        System.out.println("Printing number of valleys: " + result);
    }
}
