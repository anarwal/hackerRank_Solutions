package com.strings;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by abhimanyunarwal on 2/3/17.
 * HackerRank: Making Anagram Program
 * doesn't work as expected, need to update
 */
public class MakingAnagramProgram {
        public static int numberNeeded(String first, String second) {

            char[] firstArray = first.toLowerCase().toCharArray();
            char[] secondArray = second.toLowerCase().toCharArray();

            Map<Character, Integer> map = new HashMap<>();

            //add all the elements from first array in map, if the exist in map then increase reptition of char (i.e. value)
            for (Character ch : firstArray) {
                if (!map.containsKey(ch)) {
                    map.put(ch, 1);
                } else {
                    Integer counter = map.get(ch);
                    map.put(ch, counter + 1);
                }
            }

            //check second array, if char from second array exist in map then remove if, if it does not exist add to the map handeling value(repetition of char)
            for (Character chr : secondArray) {
                if (!map.containsKey(chr)) {
                    map.put(chr, 1);
                } else {
                    map.remove(chr);
                }
            }

            int counter=0;

            //get values from map (i.e. repetitions of unique characters and add all values)
            for(Integer i: map.values()){
                counter +=i;
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
