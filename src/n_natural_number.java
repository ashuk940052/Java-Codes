import java.util.*;
public class n_natural_number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any NUmber : ");
        int n = sc.nextInt();
        int sum=0;
        for(int i=0 ; i<n ; i++){
            sum=sum+i;
            System.out.println(sum);
        }
        System.out.println("Total sum = "+sum);

    }
}
