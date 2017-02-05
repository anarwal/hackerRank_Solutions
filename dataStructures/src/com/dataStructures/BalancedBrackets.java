package com.dataStructures;

import java.util.*;

/**
 * Created by abhimanyunarwal on 2/4/17.
 * HackerRank: Balanced Brackets Problem
 */
public class BalancedBrackets {
        public static boolean isBalanced(String expression) {

            //Implement Stack, using LIFO Property of a stack
            Stack<Character> stack = new Stack<>();

            for(char c: expression.toCharArray()){
                if( c=='{' || c=='[' || c=='('){    //Checking while adding to stack
                    stack.push(c);
                }

                //Next start popping value while checking balancing
                else if(c==')'){ if (stack.isEmpty()) return false; else if (stack.pop() != '(') return false;}
                else if(c==']'){ if (stack.isEmpty()) return false; else if (stack.pop() != '[') return false;}
                else if(c=='}'){ if (stack.isEmpty()) return false; else if (stack.pop() != '{') return false;}
            }
            return stack.isEmpty();
        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int t = in.nextInt();
            for (int a0 = 0; a0 < t; a0++) {
                String expression = in.next();
                System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
            }
        }
}
