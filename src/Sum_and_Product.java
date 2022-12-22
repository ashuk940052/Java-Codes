import java.util.*;
public class Sum_and_Product {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int choice = sc.nextInt();
        int sum=0 , product=1;
        for(int i=1 ; i<=n ; i++){
            if(choice == 1){
                sum=sum+i;
            }
            else if(choice==2){
                product = product*i;
            }
            else
                break;
        }
        if(choice == 1)
            System.out.print(sum);
        else if(choice ==2)
            System.out.print(product);
        else
            System.out.print("-1");
    }
}
