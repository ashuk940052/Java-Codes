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
    public static int fiboDP(int n){
        int[] storage = new int[n+1];
        storage[0] = 0;
        storage[1] = 1;
        for(int i=2 ; i <=n ;i++){
            storage[i] = storage[i-1]+storage[i-2];
        }
        return storage[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number : ");
        int n = sc.nextInt();
        System.out.println("fiboDP :- "+fiboDP(n));
        System.out.println("fiboM :- " + fibM(n) );//Time Complexity n
        System.out.println("fibo :- "+ fibo(n));//Time Complexity 2^n


    }
}
