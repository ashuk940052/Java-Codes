package recursion;
import java.util.*;
public class Number_of_digit {
    public static int NOD(int n){
        if(n==0){
            return 0;
        }
        int smaller_ans= NOD(n/10);
        return smaller_ans+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = sc.nextInt();
        int ans = NOD(n);
        System.out.print("Answer is : "+ans);
    }
}
