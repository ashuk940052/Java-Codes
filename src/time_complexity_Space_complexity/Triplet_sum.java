package time_complexity_Space_complexity;

import java.util.Arrays;
import java.util.Scanner;

public class Triplet_sum {
    public static int tripleSum(int[] arr , int sum){
        Arrays.sort(arr);
        int count =0;
        for (int l = 0 ; l<arr.length-2;l++){
            int num = sum - arr[l];
            int i = l+1;
            int j = arr.length-1;
            while (i < j) {
                int k =j;
                if (arr[i] + arr[j] > num) {
                    j--;
                    continue;
                } else if (arr[i] + arr[j] < num) {
                    i++;
                } else if (arr[i] + arr[j] == num) {
                    int e = arr[j];
                    while(j>i){
                        if(arr[j]==e){
                            count++;
                            j--;
                        }else
                            break;

                    }
                    i++;
                }
                if(((i-1)>=0) && (arr[i-1]==arr[i]))
                    j=k;

            }

        }
        return count;
    }
    public static void main(String [] args ){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the value : ");
        int x = sc.nextInt();
        int answer = tripleSum(arr,x);
        System.out.print(answer);

    }
}
