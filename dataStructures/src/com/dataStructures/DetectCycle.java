package com.dataStructures;

/**
 * Created by abhimanyunarwal on 2/4/17.
 * HackerRank: Detect a cycle
 * Solution using  Floyd's cycle-finding algorithm
 */

public class DetectCycle<E> {

    class Node {
        int data;
        Node next;
    }

    boolean hasCycle(Node head) {
        if(head == null)return false;       //empty list, thus retrun false;

        Node slowNode=head;
        Node fastNode=head;

        while(fastNode != null && fastNode.next != null){
            slowNode = slowNode.next; //move the slower node pointer by 1  position
            fastNode = fastNode.next.next; //move the faster node pointer by 2 positions

            if(slowNode==fastNode){  // if at certain time, these both become equal, then it means a cycle
                return true;
            }
        }
        return false;
    }
}
