package time_complexity_Space_complexity;
import java.util.*;
public class Dupplicatein_array {
    public static int findDuplicate(int[] arr){
        int sum =0;
        for (int j : arr) {
            sum = sum + j;
        }
        int sumFoumula = ((arr.length-2)*(arr.length-1))/2;
        return sum - sumFoumula;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i< n ;i++){
            arr[i]= sc.nextInt();
        }
        int answer = findDuplicate(arr);
        System.out.println(answer);


    }
}
