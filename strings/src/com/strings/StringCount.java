package com.strings;

import java.util.*;

/**
 * Created by abhimanyunarwal on 2/6/17.
 * <p>
 * Program: Take input from users as a string, then in output provide number of words, total number of characters
 * and then display each character in order they appeared along with there frequency.
 * <p>
 * Solution:
 * Number of words: Take input of string from user and then store each word by splitting based on space in an array,return length of array
 * Total Characters: Take the string input and split it based on characters, then store it inside char array
 * and store each character inside a linked hashmap(for maintaining order), with key:character and value: frequency of character
 * <p>
 * Expected Input: Abracadabra      Alakazam!!
 */

public class StringCount {

    //count words and store them in array
    public static int wordCount(String str) {
        String[] wordSet = str.split("\\s+");
        while (wordSet.length != 0) {
            return wordSet.length;
        }
        return 0;
    }


    //count characters and store them in LinkedHashMap(maintain order)
    public static void totalChars(String str) {
        Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
        char[] charArray = str.toCharArray();

        for (Character ch : charArray) {
            if (!map.containsKey(ch)) {
                map.put(ch, 1);
            } else {
                Integer counter = map.get(ch);
                map.put(ch, counter + 1);
            }
        }

        int counter = 0;

        for (Character ch : map.keySet()) {
            if (!(ch == ' ')) {
                counter += map.get(ch).intValue();
            }
        }

        System.out.println("Non-whitespace character count = " + counter);
        System.out.println("Unique breakdown of all characters in order they appeared: ");
        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + ":" + e.getValue());
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("Word Count = " + wordCount(input));
        totalChars(input);
    }
}
