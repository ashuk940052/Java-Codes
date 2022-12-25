import java.util.*;
public class Squar_root {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i,sqrt=1;
        for(i=0; i<n/2 ; i++){
            if((i*i)>n){
                sqrt = i-1;
                break;}
            }
            System.out.print(sqrt);
        }

    }
