package DP;
import java.util.Scanner;

public class MIn_Count_Of_Squar_ToNumber {
    public static int MinSquear(int n,int[] dp){
        if(n==0) {
            return 0;
        }
        int minAns = Integer.MAX_VALUE;
        for (int i=1 ; i*i <= n ; i++){
            int currAns ;
            if(dp[n-(i*i)] == -1 ){
                currAns = MinSquear(n-(i*i),dp);
                dp[n-(i*i)] = currAns;
            }else {
                currAns = dp[n-(i*i)];
            }
            if(minAns > currAns){
                minAns = currAns;
            }
        }
        int myAns= 1 + minAns;
        return myAns;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :- ");
        int n = sc.nextInt();
        int[] dp = new int[n+1];
        for (int i=0; i<dp.length ;i++){
            dp[i]= -1;
        }
        System.out.println(MinSquear(n,dp));
    }
}
