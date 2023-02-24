package recursion;

import java.util.Scanner;

public class Sort_element {
    public static boolean sort(int[] arr , int n ){
     if (n  >= arr.length-1){
         return true;
     }
     if(arr[n]>arr[n+1]){
         return false;
     }
     boolean smallans = sort(arr,n+1);
     return smallans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0 ; i< n ;i++){
            arr[i] = sc.nextInt();
        }
        boolean ans = sort(arr,0);
        System.out.println(ans);
    }
}
