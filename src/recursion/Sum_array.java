package recursion;

import java.util.Scanner;

public class Sum_array {
    public static int Calculate(int[] arr ,int n){
        if(n>=arr.length-1){
            return arr[n];
        }
        int sum =0;
        int smallerans = Calculate(arr,n+1);
        System.out.println(n);
        sum =smallerans+ arr[n];
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the Size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        int sum = Calculate(arr,0);
        System.out.println(sum);
    }
}
