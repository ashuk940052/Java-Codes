package HashMaps;
import java.util.HashMap;
import java.util.Scanner;

public class Max_Frequency {
    public static int Max_Frequency(int[] arr){
        HashMap<Integer,Integer> frequency = new HashMap<>();
        for (int j : arr) {
            if (frequency.containsKey(j)) {
                frequency.put(j, frequency.get(j) + 1);
            } else {
                frequency.put(j, 1);
            }
        }
        int max = 0;
        int maxKey = Integer.MIN_VALUE;
        for (int j : arr) {
            if (frequency.get(j) > max) {
                max = frequency.get(j);
                maxKey = j;
            }
        }
        return maxKey;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i< n ; i++){
            arr[i] = sc.nextInt();
        }
        int answer = Max_Frequency(arr);
        System.out.println(answer);

    }
}
