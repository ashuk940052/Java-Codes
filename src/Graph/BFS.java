package Graph;

import java.util.Scanner;

public class BFS {
    public static void printHelperDFS(int[][] edges , int sv,boolean[] visited){
        System.out.println(sv);
        visited[sv] = true;
        int n = edges.length;
        for(int i=0 ; i< n  ;i++){
            if(edges[sv][i] == 1 && !visited[i]){
                printHelperDFS(edges,i,visited);
            }
        }
    }
    public static void DFS(int[][] edges ){
        boolean[] visited = new boolean[edges.length];
        for(int i=0 ;i< edges.length ;i++) {
            if(!visited[i]) {
                printHelperDFS(edges, i, visited);
            }
        }
    }
    public static void printHelperBFS(int[][] edges , int sv , boolean[] visited) throws queueEmptyExeption {
     Queue_Using_LL<Integer> q = new Queue_Using_LL<Integer>();
     q.enqueue(sv);
     int n = edges.length;
     visited[sv] = true;
     while (!q.isEmpty()){
         int front = q.dequeue();
         System.out.println(front);
         for (int i=0; i< n ;i++){
             if(edges[front][i] == 1 && !visited[i]){
                   q.enqueue(i);
                   visited[i] = true;
             }
         }
      }
    }
    public static void BFS(int[][] edges ) throws queueEmptyExeption {
        boolean[] visited = new boolean[edges.length];
        for(int i=0; i< edges.length ;i++){
           if(!visited[i]){
               printHelperBFS(edges,i,visited);
           }
        }
    }
    public static void main(String[] args) throws queueEmptyExeption {
        int n ; //number of vertices
        int e;  // number of edges
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        e = sc.nextInt();
        int[][] edges = new int[n][n];
        for(int i=0 ; i< e ; i++){
            int fv = sc.nextInt();
            int ev = sc.nextInt();
            edges[fv][ev] = 1;
            edges[ev][fv] =1;
        }
        System.out.println("DFS :-");
        DFS(edges);
        System.out.println("BFS :-");
        BFS(edges);

    }
}
