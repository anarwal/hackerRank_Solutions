package com.collections;

import java.io.*;
import java.util.*;

/**
 * Created by abhimanyunarwal on 3/1/20.
 * HackerRank: Sherlock and anagrams program
 */

public class SherlockAndAnagrams {
    static int sherlockAndAnagrams(String s) {
        int counter=0;
        List<String> al = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                al.add(s.substring(i,j));
            }
        }
        for (int m = 0; m < al.size(); m++) {
            for (int n = m + 1; n < al.size(); n++) {
                String s1 = al.get(m);
                String s2 = al.get(n);
                if (s1.length() == s2.length()) {
                    if(al.get(m).length() == 1 && al.get(n).length() == 1){
                        counter++;
                    }else if (al.get(m).length() != 1 && al.get(n).length() != 1){
                        HashMap<Character, Integer> hmap1 = new HashMap<>();
                        HashMap<Character, Integer> hmap2 = new HashMap<>();

                        char arr1[] = s1.toCharArray();
                        char arr2[] = s2.toCharArray();

                        for (int i = 0; i < arr1.length; i++) {

                            if (hmap1.get(arr1[i]) == null) {

                                hmap1.put(arr1[i], 1);
                            } else {
                                Integer c = (int) hmap1.get(arr1[i]);
                                hmap1.put(arr1[i], ++c);
                            }
                        }

                        // Mapping second String
                        for (int j = 0; j < arr2.length; j++) {

                            if (hmap2.get(arr2[j]) == null)
                                hmap2.put(arr2[j], 1);
                            else {

                                Integer d = (int) hmap2.get(arr2[j]);
                                hmap2.put(arr2[j], ++d);
                            }
                        }
                        if (hmap1.equals(hmap2)) {
                            counter++;
                        }
                    }
                }
            }

        }
        return counter;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();
            int result = sherlockAndAnagrams(s);
            System.out.println(result);
        }
        scanner.close();
    }
}
