package HashMaps;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class remove_Duplicates {
    public static ArrayList<Integer> remove_Duplicates(int[] a){
        ArrayList<Integer> Output = new ArrayList<>();
        HashMap<Integer,Boolean> seen = new HashMap<>();
        for (int j : a) {
            if (seen.containsKey(j)) {
                continue;
            }
            Output.add(j);
            seen.put(j, true);
        }
        return Output;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i< n ; i++){
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> output = remove_Duplicates(arr);
        for (Integer ashu : output) {
            System.out.print(ashu + " ");
        }
    }
}
