package recursion;
import java.util.*;
public class All_indices_of_number {
    public static int[] all_index(int[] input , int x ){
        return all_index(input,x,0,input.length-1);
    }
    public static int[] all_index(int[] input,int x , int si , int li){
        if(si>li){
            return new int[0];
        }
        int[] smallans = all_index(input,x,si+1,li);
        if(input[si]==x){
            int[] ans = new int[smallans.length+1];
            ans[0]=si;
            for (int i=0 ;i<smallans.length;i++){
                ans[i+1]=smallans[i];
            }
                return ans;
        }
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
        int[] restult = all_index(arr,x);
        for (int i : restult){
            System.out.print((i+1)+" ");
        }
    }
}
