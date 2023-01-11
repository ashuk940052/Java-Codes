package recursion;
import java.util.*;
public class Last_index_number {
    public static int last_index(int[] input, int x){
        return last_index(input , x ,input.length-1);
    }
    public static int last_index(int[] input, int x , int li){
        if(li == 0){
            if(input[li]==x){
                return 0;
            }
            else {
                return -1;
            }
        }
        if(input[li]==x){
            return li;
        }
        return last_index(input,x,li-1);
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
        int answer = last_index(arr,x);
        System.out.println(answer);

    }
}
