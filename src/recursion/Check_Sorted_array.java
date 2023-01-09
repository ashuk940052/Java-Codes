package recursion;
import java.util.*;
public class Check_Sorted_array {
    public static boolean check_sorted(int[] arr){
        if(arr.length<=1){
            return true;
        }
        int[] smallarray = new int[arr.length-1];
        System.arraycopy(arr, 1, smallarray, 0, arr.length - 1);
        boolean result = check_sorted(smallarray);
        if(!result){
            return false;
        }
        return arr[0] <= arr[1];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i =0 ;i<n ; i++){
            arr[i] =sc.nextInt();
        }
        boolean ans = check_sorted(arr);
        if(ans){
            System.out.println("Sorted :😎");
        }
        else {
            System.out.println("Not Sorted : 🥱");
        }

    }
}
