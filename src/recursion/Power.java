package recursion;
import java.util.*;
public class Power {
    public static int power(int x , int n){
        if(n==0){
            return 1;
        }
        int smaller_ans = power(x,n-1);
        return x*smaller_ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x : ");
        int x = sc.nextInt();
        System.out.print("Enter n :");
        int n = sc.nextInt();
        int ans = power(x,n);
        System.out.println("'x' to the power 'n' is (x^n) : "+ ans);

    }
}
