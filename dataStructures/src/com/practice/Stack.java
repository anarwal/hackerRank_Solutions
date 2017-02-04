package com.practice;

/**
 * Created by abhimanyunarwal on 1/31/17.
 * implement stack (LIFO) using array
 */
public class Stack{
    int size;
    int[] stackArray;
    int top;

    public Stack(int s){
        size = s;
        stackArray = new int[size];
        top = -1;
    }

    public int push (int num){return stackArray[++top]=num;}
    public int pop (){return stackArray[top--];}
    public int peek (){return stackArray[top];}
    public boolean isFull(){if(top==size-1){return true;}return false;}

    public static void main(String[] args){
        Stack stack=new Stack(5);
        stack.push(4);
        stack.push(2);
        stack.push(1);
        stack.push(3);
        stack.push(6);


        System.out.println("Stack's current size is: "+stack.size);
        if(!stack.isFull()){
        stack.push(6);
        }
        else{
        System.out.println("Stack is full, let me delete an element, poping: "+stack.peek());
        stack.pop();
        System.out.println("Popping one more: "+stack.peek());
        stack.pop();
        System.out.println("Stack's top has been popped, now adding");
        stack.push(6);
        }
        }


}