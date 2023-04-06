package DP;

import java.util.Scanner;

public class Number_Of_Balanced {
    public static int countBalancedBT(int h){
    int mod = (int)Math.pow(10,9)+7;
    return countBalancedBT(h,mod);
    }
    public static int countBalancedBT(int h,int mod){
        if(h ==0 || h == 1){
            return 1;
        }
        int x= countBalancedBT(h-1);
        int y = countBalancedBT(h-2);
        long res1 = (long)x * x;
        long res2 = (long)x * y * 2;
        int value1 = (int)( res1 % mod);
        int value2 = (int)(res2 % mod);
        return (value1+value2) % mod;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Hight :-");
        int h = sc.nextInt();
        long ans = countBalancedBT(h);
        System.out.println(ans);
    }
}
