package com.dataStructures;

/**
 * Created by abhimanyunarwal on 2/4/17.
 * HackerRank: Check if binary tree is a binary search tree
 */
public class IsBST {

    class Node {
        int data;
        Node left;
        Node right;
    }

    boolean checkBST(Node root){
        //given minimum value is 0
        //given maximum value is 10000
        return checkBST(root, 0, 10000);
    }

    boolean checkBST(Node node, int min, int max) {
        //Check if the root is null and return true
        if (node == null) { return true;}

        //goes out of the bound, it is not a BST
        if(node.data<min || node.data>max){return false;}

        //recursively call itself for left child and right child
        return checkBST(node.left,min,node.data-1) && checkBST(node.right,node.data+1,max);
    }

}
