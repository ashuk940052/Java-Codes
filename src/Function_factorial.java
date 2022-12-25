import java.util.*;
public class Function_factorial {

    public static int factorial(int n){
        int ans=1;
        for (int i=1 ; i<=n ; i++){
            ans = ans *i;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int r = sc.nextInt();
        int fact;
        fact = factorial(num)/(factorial(r)*factorial(num-r));
        System.out.println(fact);
    }
}
