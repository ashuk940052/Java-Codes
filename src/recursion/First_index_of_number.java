package recursion;
import java.util.*;
public class First_index_of_number {
    public static int first_index(int[] input,int x){
       return first_index(input,x,0);
    }
    public static int first_index(int[] input , int x , int start_index){
        if(start_index==input.length-1) {

            if (input[start_index] == x) {
                return start_index;
            } else {
                return -1;
            }
        }
        if (input[start_index] == x) {
            return start_index;
        }
    int smallans=first_index(input,x,start_index+1);
        return smallans;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number : ");
        int x = sc.nextInt();
        int ans = first_index(arr , x);
        System.out.println(ans + 1);
    }
}
