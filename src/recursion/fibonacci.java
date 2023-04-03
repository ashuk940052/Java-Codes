package recursion;
import java.util.*;
public class fibonacci {
    public static int fibo(int n){
        if( n==1 || n==0){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
    public static int fibM(int n){
     int[] storage = new int[n+1];
     for (int i=0 ; i<=n ;i++){
         storage[i] = -1;
     }
     return fibM(n , storage);
    }
    public static int fibM(int n , int[] storage){
        if( n==1 || n==0){
           storage[n] = n;
           return storage[n];
        }
        if(storage[n] != -1){
            return storage[n];
        }
        storage[n] = fibM(n-1,storage) + fibM(n-2,storage);
        return storage[n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number : ");
        int n = sc.nextInt();
        int N = fibo(n);
        int M = fibM(n);
        System.out.println("fibo :- "+ N );
        System.out.println("fiboM :- " + M );
    }
}
