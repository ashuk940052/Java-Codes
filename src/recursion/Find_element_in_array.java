package recursion;
import java.util.*;
public class Find_element_in_array {
    public static boolean Find_element(int[] input , int x ){
        if(input.length==1){
            return input[0] == x;
        }
        else if(input[input.length-1]==x){
            return true;
        }
        int[] smallcheck = new int[input.length-1];
        System.arraycopy(input, 0, smallcheck, 0, input.length - 1);
        return Find_element(smallcheck,x);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array Size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the element : ");
        int x = sc.nextInt();
        boolean feia = Find_element(arr,x);
        System.out.print(feia);
    }
}
