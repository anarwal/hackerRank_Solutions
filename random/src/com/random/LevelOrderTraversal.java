package com.random;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by abhimanyunarwal on 3/1/17.
 */


class TreeNode{
    TreeNode left,right;
    int data;
    TreeNode (int data){
        this.data=data;
        left=right=null;
    }
}

class LevelOrderTraversal {

    static void levelOrder(TreeNode root){
        //Write your code here
        if(root==null){return;}

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);

        while (!queue.isEmpty()){
            TreeNode n = queue.poll();
            System.out.print(n.data+" ");

            if(n.left !=null){
                queue.add(n.left);
            }
            if (n.right !=null){
                queue.add(n.right);
            }
        }
    }

    public static TreeNode insert(TreeNode root,int data){
        if(root==null){
            return new TreeNode(data);
        }
        else{
            TreeNode cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        TreeNode root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        levelOrder(root);
    }
}
