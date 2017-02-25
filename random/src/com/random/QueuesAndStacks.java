package com.random;


import java.io.*;
import java.util.*;


/**
 * Created by abhimanyunarwal on 2/25/17.
 */
public class QueuesAndStacks {

    Stack<Character> stack = new Stack<>();
    Queue<Character> queue = new LinkedList<>();

    private void pushCharacter (char c){ stack.push(c);}
    private char popCharacter(){return stack.pop();}
    private void enqueueCharacter(char c){queue.add(c);}
    private char dequeueCharacter(){return queue.poll();}


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        QueuesAndStacks p = new QueuesAndStacks();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is "
                + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}
