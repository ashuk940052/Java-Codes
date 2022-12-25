import java.util.*;
public class Pattern_11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <= n - 1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= n - 1 - i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
























