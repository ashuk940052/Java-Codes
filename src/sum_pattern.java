import java.util.*;
public class sum_pattern {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int i=1;
    while(i<=n){
        int j=1,sum=0,num=1;
        while(j<=i){
            System.out.print(num+"");
            sum=sum+num;
           if(num<i)
           {
               System.out.print("+");
           }num++;
            j++;

        }
        System.out.print("=");
        System.out.print(sum);
        System.out.println();
        i++;
    }
 }
}
