package recursion;
import java.util.*;
public class Multiplication {
    public static int multipication(int m, int n ){
        if(m==0){
            return 0;
        }
        return n + multipication(m-1,n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two number : ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int answer = multipication(m,n);
        System.out.println(answer);
    }
}
