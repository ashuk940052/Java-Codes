import java.util.*;
public class Decimal_to_binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int rem;
        int binary=0;
        int plac_value=1;
        while(n>0){
            rem=n%2;
            binary = binary+rem*plac_value;
            n=n/2;
            plac_value = plac_value*10;

        }
        System.out.print(binary);
    }
}
