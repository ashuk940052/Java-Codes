package recursion;
import java.util.*;

public class Print_number {
    public static void print(int n ){
        if(n==0){
            return ;
        }
        else {
            print(n-1);
            System.out.print(n+" ");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        print(n);

    }
}
