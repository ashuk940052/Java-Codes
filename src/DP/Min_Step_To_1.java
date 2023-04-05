package DP;

import java.util.Scanner;

public class Min_Step_To_1 {
    public static int countSteps(int n ){
        if(n == 1){
            return 0;
        }
        int minSteps = countSteps(n-1);
        if( n%3==0){
            int op2 = countSteps(n/3);
            if(op2 < minSteps){
                minSteps = op2;
            }
        }
        if( n%2==0){
            int op3 = countSteps(n/2);
            if(op3 < minSteps){
                minSteps = op3;
            }
        }
        return 1+minSteps;
    }
    public static int countStepsM(int n){
        int[] storage = new int[n+1];
        return countStepsM(n , storage);
    }
    private static int countStepsM(int n , int[] Storage){
        if(n==1){
            Storage[n] = 0;
            return Storage[n];
        }
        if(Storage[n] != 0){
            return Storage[n];
        }
        int minSteps = countStepsM(n-1,Storage);
        if( n%3==0){
            int op2 = countStepsM(n/3,Storage);
            if(op2 < minSteps){
                minSteps = op2;
            }
        }
        if( n%2==0){
            int op3 = countStepsM(n/2,Storage);
            if(op3 < minSteps){
                minSteps = op3;
            }
        }
        Storage[n] =1+minSteps;
        return Storage[n];

    }
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
     int n = sc.nextInt();
     int ans = countSteps(n);
        System.out.println(ans);
        System.out.println(countStepsM(n));
    }
}
