package com.dataStructures;

import java.util.*;

/**
 * Created by abhimanyunarwal on 2/4/17.
 * HackerRank: Implement a queue with two stacks
 */
public class QueueUsingStack {

        public static class MyQueue<T> {
            Stack<T> stackNewestOnTop = new Stack<T>();
            Stack<T> stackOldestOnTop = new Stack<T>();

            // Push onto oldest stack
            public void enqueue(T value) {
                stackOldestOnTop.push(value);
            }

            public T peek() {
                // fill out new stack with old stack if old stack is empty
                if(stackNewestOnTop.isEmpty()) {
                    while (!stackOldestOnTop.isEmpty())
                        stackNewestOnTop.push(stackOldestOnTop.pop());
                }
                return stackNewestOnTop.peek();

            }

            public T dequeue() {
                // fill out new stack with old stack if old stack is empty
                if(stackNewestOnTop.isEmpty()) {
                    while (!stackOldestOnTop.isEmpty())
                        stackNewestOnTop.push(stackOldestOnTop.pop());
                }

                T value = null;
                if(!stackNewestOnTop.isEmpty()) {
                    value = stackNewestOnTop.pop();
                }

                return value;
            }
        }


        public static void main(String[] args) {
            MyQueue<Integer> queue = new MyQueue<Integer>();

            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();

            for (int i = 0; i < n; i++) {
                int operation = scan.nextInt();
                if (operation == 1) { // enqueue
                    queue.enqueue(scan.nextInt());
                } else if (operation == 2) { // dequeue
                    queue.dequeue();
                } else if (operation == 3) { // print/peek
                    System.out.println(queue.peek());
                }
            }
            scan.close();
        }
}


