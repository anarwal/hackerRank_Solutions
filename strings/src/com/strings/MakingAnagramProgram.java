package com.strings;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by abhimanyunarwal on 2/3/17.
 * HackerRank: Making Anagram Program
 */
public class MakingAnagramProgram {
        public static int numberNeeded(String first, String second) {

            char[] firstArray = first.toLowerCase().toCharArray();
            char[] secondArray = second.toLowerCase().toCharArray();

            Map<Character, Integer> map = new HashMap<>();
            int counter = 0;

            //add all the elements from first array in map, if the exist in map then increase reptition of char (i.e. value)
            for (Character ch : firstArray) {
                if (!map.containsKey(ch)) {
                    map.put(ch, 1);
                } else {
                    Integer count = map.get(ch);
                    map.put(ch, count + 1);
                }
            }

            //check second array, if char from second array exist in map then reduce frequency, if it does not exist directly increase counter for removing it
            for (Character chr : secondArray) {
                if (!map.containsKey(chr)) {
                    counter++;
                } else {
                    if (map.get(chr) == 1) {
                        map.remove(chr);
                    } else {
                        Integer count = map.get(chr);
                        map.put(chr, count - 1);
                    }
                }
            }


                //get values from map (i.e. repetitions of unique characters and add all values)
                for (Integer i : map.values()) {
                    counter += i;
                }

                return counter;
        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String a = in.next();
            String b = in.next();

            System.out.println(numberNeeded(a, b));
        }
}
