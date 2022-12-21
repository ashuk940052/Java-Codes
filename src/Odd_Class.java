import java.util.*;
public class Odd_Class {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;
        while(i<=n){
            int j=i-1;
            while(j<n){
                System.out.print(j*2+1+"");
                j++;
            }
            j=0;
            while(j<i-1){
                System.out.print(j*2+1+"");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
