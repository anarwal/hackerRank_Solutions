package com.random;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by abhimanyunarwal on 2/19/17.
 */
public class FindContact {

    static Map<String, Integer> map = new HashMap<String, Integer>();

    public static void addNumbers(String name,int num){
        map.put(name.toLowerCase(), num);
    }


    public static void findNumber(String name){
        if(map.containsKey(name)){
            System.out.println(name+"="+map.get(name));
        }else{
            System.out.println("Not found");
        }
    }
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            addNumbers(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            findNumber(s);
        }
        in.close();
    }
}
