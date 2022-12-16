import java.util.*;
public class loop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter any number :");
        int n = sc.nextInt();
//        for(int i=1 ; i<=n ; i++ ){
//            System.out.println(i+": Prashant kumar");

        int i=1 ;
        while(i<=10){
            System.out.println(n+"*"+i+"="+i*n);
            i++;
        }
    }
}
