import java.util.*;
public class Pattern_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=0;
        while(i<n){
           int j=1;
           while(j<=n-i){
               System.out.print(j);
               j++;
           }int k=1;
           while(k<=i){
               System.out.print("*");
               k++;
           }k--;
           while(k>0){
               System.out.print("*");
               k--;
           }
           j--;
           while(j>0){
               System.out.print(j);
               j--;
           }
            System.out.println();

            i++;
        }
    }
}
