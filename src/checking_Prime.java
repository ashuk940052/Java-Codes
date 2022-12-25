import java.util.*;
public class checking_Prime {
    public static boolean isprime(int n){
        int d=2;
        while(d<n) {
            if (n%d == 0) {
                return false;
            }
            d++;
        }
        return true;
    }
    public static void chacking_prime(int n){
        for(int i =2 ; i<=n ; i++){
            boolean isIprime = isprime(i);
            if(isIprime){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
       int num = sc.nextInt();
       chacking_prime(num);
    }

}
