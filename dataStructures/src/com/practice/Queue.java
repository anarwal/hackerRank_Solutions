package com.practice;

import java.util.Arrays;

/**
 * Created by abhimanyunarwal on 1/31/17.
 * implement queue using array
 */
public class Queue {
    private int front;
    private int rear;
    int size;
    int[] queue;

    //initialize constructor
    public Queue(int inputSize) {
        if(inputSize<0){
            System.out.println("Negative values not allowed");
        }
        front=-1;
        rear=-1;
        size = inputSize;
        queue = new int[inputSize];
    }

    public boolean isEmpty() {
        if (front == -1 && rear == -1) {
            return true;
        }
        return false;
    }

    //inserting element in queue
    public void enqueue(int element) {

        if ((front - rear + 1) == size) {
            System.out.println("Sorry the queue is already full");
        } else if(isEmpty()){
            front++;
            rear++;
            queue[rear]=element;
        }
        else{
            rear=(rear+1)%size;
            queue[rear]=element;
        }
    }

    //removing element in queue (FIFO)
    public int dequeue(){
        int value=0;
        if(isEmpty()){
            System.out.println("The queue is already empty, nothing to delete");
        }
        else if(front==rear){
            System.out.println("There is just one element in queue");
            value=queue[front];
            front--;
            rear--;
        }else{
            value=queue[front];
            front=(front+1)%size;
        }
        return value;
    }

    public void display(){
        System.out.println(Arrays.toString(queue));
    }

    public static void main(String[] args) {
        Queue newQueue= new Queue(5);
         newQueue.enqueue(4);
         newQueue.enqueue(3);
         newQueue.enqueue(7);
         newQueue.display();
    }
}