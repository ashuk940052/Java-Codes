import java.util.*;
public class Grover_number {
    public static int solve(int L ,int R , int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i=0; i<arr.length-1; i++){
            for (int j = L ; j<=R ; j++){
                if(arr[i] == j){
                    ans.add(arr[i]);
                }
            }
        }
        return ans.size();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range : ");
         int L = sc.nextInt();
         int R = sc.nextInt();
        System.out.println("entre the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i< n ; i++){
            arr[i] = sc.nextInt();
        }
        int ans= solve(L,R,arr);
        System.out.println(ans);
    }
}
