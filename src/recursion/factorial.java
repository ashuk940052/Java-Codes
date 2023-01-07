package recursion;
import java.util.*;
public class factorial {
    public  static int fact(int n){
        if(n==0){
            return 1;
        }
        int smallans = fact(n-1);
        return n*smallans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Positive number : ");
        int n = sc.nextInt();
        if(n<0){
            System.out.println("Invalid Input");
        }else {
            int ans = fact(n);
            System.out.println(ans);
        }

    }
}
