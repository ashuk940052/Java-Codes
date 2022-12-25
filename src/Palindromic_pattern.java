import java.util.*;
public class Palindromic_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         for(int i =1 ; i<=n ; i++)
         {
             for(int j =1 ; j<=n-i ; j++){
                 System.out.print(" ");
             }int j;
             for(j =i ; j>=1 ; j--){
                 System.out.print(j);
             }
             for(j =2 ; j<=i; j++){
                 System.out.print(j);
             }
             System.out.println();
         }
    }
}
