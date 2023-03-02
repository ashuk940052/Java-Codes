package recursion;

import java.util.Scanner;

public class Linear_Search {
    public static boolean check_Linear(int[] arr , int i, int ele){
        if(i >= arr.length-1){
            return false;
        }
        if (arr[i]==ele){
            return true;
        }
        return check_Linear(arr,i+1,ele);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i =0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element which you want to search : ");
        int ele = sc.nextInt();
        boolean ans = check_Linear(arr, 0,ele);
        System.out.println(ans);
    }
}
