package recursion;
import java.util.*;
public class Sum_of_array {
    public static int sum1(int[] input){
            if(input.length==1){
                return input[0];
            }
            int[] smallarray = new int[input.length-1];
           for (int i=0 ;i<input.length-1;i++){
               smallarray[i]=input[i];
           }
           int small_res = input[input.length-1]+sum1(smallarray);
           return small_res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i =0 ;i<n ; i++){
            arr[i] =sc.nextInt();
        }
        int arr_sum = sum1(arr);
        System.out.println("Array sum : "+ arr_sum);

    }

}
