package recursion;
import java.util.*;
public class fibonacci {
    public static long fibo(int n){
        if( n<=1){
            return n;
        }
        return fibo(n-1)+fibo(n-2);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number : ");
        int n = sc.nextInt();

         for(int i=0; i<n ; i++) {
             long ans = fibo(i);
             System.out.print( ans+" ");
         }
    }
}
