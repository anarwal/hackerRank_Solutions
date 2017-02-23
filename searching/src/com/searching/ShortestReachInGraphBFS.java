package com.searching;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by abhimanyunarwal on 2/20/17.
 * HackerRank: Shortest Path Between Edges
 */
public class ShortestReachInGraphBFS {

         public static int baseDistance = 6;
         public static class Node{
             public int id;
             public int distance;
             public HashSet<Node> vertices;

             public Node(int id){
                 this.id=id;
                 distance=-1;
                 vertices = new HashSet<>();
             }

             public void addEdge(Node vertix){
                 vertices.add(vertix);
                 vertix.vertices.add(this);
             }
         }


         public static void buildGraph(Node start){
             if(start==null){
                 return;
             }

             //initialize queue which will be used for traversing via BFS
             Queue<Node> queue=new LinkedList<Node>();


             //adding self
             start.distance=0;
             queue.add(start);


             while(!queue.isEmpty()){
                 Node temp = queue.remove();

                 for(Node v: temp.vertices){
                     if(v.distance == -1){//in case it is not visited already

                         v.distance = temp.distance + baseDistance;
                         queue.add(v);

                     }
                 }
             }


         }



//        public static class Graph {
//
//            public int id;
//            public int distance = -1;
//
//            HashSet<Graph> neigborsl
//            int vertices;
//            LinkedList<Integer> list[];
//
//            public Graph(int size) {
//              vertices=size;
//              distance = -1;
//              list=new LinkedList[vertices];
//              for(int i=0; i<vertices;i++){
//                  list[i]=new LinkedList();
//              }
//
//            }
//
//            public void addEdge(int first, int second) {
//                list[first].add(second);
//            }
//
//            public int[] shortestReach(int startId) { // 0 indexed
//                boolean visit[] = new boolean[vertices];
//                //queue for bfs
//                Queue<Integer> queue=new LinkedList<>();
//
//                //visit each node starting from startNode and keep adding in queue
//                visit[startId] = true;
//                queue.add(startId);
//
//
//                while(queue.size() !=0){
//                    queue.poll();
//
//                    for(int i=0; i<list[startId].size();i++){
//                        int n=i+1;
//                        if(!visit[n]){
//                           visit[n]=true;
//
//                           queue.add(n);
//                        }
//                    }
//                }
//                return new int[0];
//            }
//        }


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int queries = scanner.nextInt();

            for (int t = 0; t < queries; t++) {

                int n=scanner.nextInt();

                // Create a graph of size n where each edge weight is 6:
                Node[] node = new Node[n+1];
                node[0]=null;

                for(int i=1; i<=n; i++){
                    node[i]= new Node(i);
                }

                //total number of edges supposed ot be entered
                int m = scanner.nextInt();

                // read and set edges
                for (int j = 0; j < m; j++) {
                    int u = scanner.nextInt();
                    int v = scanner.nextInt();

                    // add each edge to the graph
                    node[u].addEdge(node[v]);
                }

                // Find shortest reach from node s
                int startId = scanner.nextInt();
                buildGraph(node[startId]);

                for (int k = 1; k <=n; k++) {
                    if (k != startId) {
                        System.out.print(node[k].distance+ " ");
                    }
                }
                System.out.println();
            }

            scanner.close();
        }
}

