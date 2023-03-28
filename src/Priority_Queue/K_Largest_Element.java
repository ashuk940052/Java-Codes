package Priority_Queue;

import java.util.PriorityQueue;
import java.util.Scanner;

public class K_Largest_Element {
    public static void K_Largest_element(int[] arr , int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int i=0;
        for( ; i<k ; i++){
            pq.add(arr[i]);
        }
        for( ; i<arr.length ;i++){
           int min = pq.element();
           if(min < arr[i]){
               pq.remove();
               pq.add(arr[i]);
           }
        }
        while (!pq.isEmpty()){
            System.out.print(pq.remove() + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of teh array : " );
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i<n ;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the value of K : ");
        int k = sc.nextInt();
        K_Largest_element(arr,k);
    }
}
