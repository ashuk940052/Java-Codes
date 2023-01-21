package time_complexity_Space_complexity;

import java.util.Scanner;

public class Left_rotate_an_array {
    public static void left_rotate(int[] arr , int d){
        int n = arr.length;
        reverse(arr , 0 , d-1);
        reverse(arr, d , n-1);
        reverse(arr , 0 , n-1);

    }
    public static void reverse(int[] arr , int start , int end ){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0 ; i<n ; i++){
            arr[i]= sc.nextInt();
        }
        System.out.print("Enter the left rotation value : ");
        int d =sc.nextInt();
        left_rotate(arr,d);
        for (int i=0; i<n ; i++){
            System.out.print(arr[i] +" ");
        }

    }
}
