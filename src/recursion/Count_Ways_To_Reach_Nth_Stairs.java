package recursion;
import java.util.*;
public class Count_Ways_To_Reach_Nth_Stairs {
    public static int Count_Stairs(int n){
        //Base case
        if(n<0)
            return 0;
        if (n==0)
            return 1;
        //Recursion Call
        return Count_Stairs(n-1)+Count_Stairs(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Stairs: ");
        int n= sc.nextInt();
        int ans = Count_Stairs(n);
        System.out.println(ans);

    }
}
