package com.dataStructures;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ContactPredictiveSearch {


    public static class TrieNode{
        Map<Character, TrieNode> map;
        public boolean endOfWord;
        public int size = 0;
        public TrieNode(){
            this.map=new HashMap<Character, TrieNode>();
            this.endOfWord=false;
        }
    }

    private static TrieNode root=new TrieNode();


    public static void insert(String word){
        TrieNode current = root;
        for(int i=0; i<word.length(); i++){
            char ch= word.charAt(i);
            TrieNode node = current.map.get(ch);
            if(node == null){
                node= new TrieNode();
                current.map.put(ch, node);
            }
            current = node;
            current.size++;
        }
        current.endOfWord=true;
    }


    public static int find(String word){
        TrieNode current = root;
        for(int i=0; i<word.length(); i++){
            char ch=word.charAt(i);
            TrieNode node =current.map.get(ch);
            if(node ==null){
                return 0;
            }
            current = node;
        }
        return current.size;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            String op = in.next();
            String contact = in.next();
            if(op == "add"){insert(contact);}
            else if (op == "find"){System.out.println(find(contact));}
        }
    }
}
