package Graph;


import java.util.*;
class Edge implements Comparable<Edge> {
    int sourse;
    int dest;
    int weight;

    public int compareTo(Edge o) {
     return this.weight - o.weight;
    }
}
public class Kruskals_Algorithm {
    public static int findParent(int v , int[] parent){
        if(parent[v] == v ){
            return v;
        }
        return findParent(parent[v] , parent);
    }
    public  static void kurskals(Edge input[] , int n){
        Arrays.sort(input);
        Edge[] output = new Edge[n-1];
        int[] parent = new int[n];
        for(int i=0; i<n ;i++){
            parent[i] =i;
        }
        int count =0;
        int i=0;
        while (count != n-1){
            Edge curentEdge = input[i];
            int sourseParent = findParent(curentEdge.sourse, parent);
            int DestinationParent = findParent(curentEdge.dest,parent);
            if(sourseParent != DestinationParent){
              output[count] = curentEdge;
              count++;
              parent[sourseParent] = DestinationParent;
            }
            i++;
        }
        for (int j=0 ; j< n-1 ;j++){
            if(output[j].sourse < output[j].dest)
            System.out.println(output[j].sourse+" "+output[j].dest+" "+output[j].weight);
            else
                System.out.println(output[j].dest+" "+output[j].sourse+" "+output[j].weight);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();
        Edge[] input = new Edge[e];
        for(int i=0 ;i< e ; i++){
            input[i] = new Edge();
            input[i].sourse = sc.nextInt();
            input[i].dest = sc.nextInt();
            input[i].weight = sc.nextInt();

        }
        kurskals(input,e);
    }
}
