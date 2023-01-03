import java.util.*;
public class beautiful_sum {
public static int beautifulIndex(int n , int[] arr){
    long sum=0;
    long psum=0;
    int i;
    for(i=0 ; i<n; sum+=arr[i],i++);
    for(i=0 ; i<n ; i++){
            sum -= arr[i];
            if(psum==sum){
                return i+1;
            }
            psum += arr[i];
        }
    return -1;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        int x = beautifulIndex(n , arr);
        System.out.println(x);
    }
}
