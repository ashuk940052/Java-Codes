import java.util.*;
public class Binnary_to_decimal {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int i =0;
        int res = 0;
        while(n>0){
            res = (int)(res + (n%10)*Math.pow(2,i));
            n=n/10;
            i++;
        }
        System.out.print(res);
    }
}
