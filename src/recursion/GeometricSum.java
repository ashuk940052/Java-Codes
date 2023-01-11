package recursion;
import java.util.*;

public class GeometricSum {
public static double Gsum(int k){
    if(k==0){
        return 1;
    }
    return 1/Math.pow(2,k) + Gsum(k-1);

}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        double ans = Gsum(n);
        System.out.println(ans);
    }
}
