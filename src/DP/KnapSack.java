package DP;

import java.util.Scanner;

public class KnapSack {
    public static int knapSack(int[] weight , int[] value , int maxWeight){

     return knapSack(weight,value,maxWeight,0);
    }
    public static int knapSack(int[] weight , int[] value , int maxWeight, int i) {
        if (i == weight.length || maxWeight == 0) {
            return 0;
        }
        if (weight[i] > maxWeight) {
            return knapSack(weight, value, maxWeight, i + 1);
        }else {
            int option1 = value[i] + knapSack(weight , value ,maxWeight-weight[i] ,i+1);
            int option2 = knapSack(weight , value ,maxWeight ,i+1);
            return Math.max(option1,option2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size Of the array :- ");
        int n = sc.nextInt();
        int[] weight = new int[n];
        int[] value = new int[n];
        System.out.print("Weight :- ");
         for(int i=0; i< n ;i++){
            weight[i] = sc.nextInt();
          }
        System.out.print("Value :- ");
        for(int i=0; i< n ;i++){
            value[i] = sc.nextInt();
        }
        System.out.print("Enter MaxWeight :");
        int maxWight = sc.nextInt();
        System.out.print(knapSack(weight,value,maxWight));

    }
}
