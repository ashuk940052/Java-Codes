package time_complexity_Space_complexity;
import java.util.*;
public class Array_Intersection {
    public static void intersection(int[] arr1 , int[] arr2){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i =0 , j=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]==arr2[j]){
                System.out.print(arr1[i]);
                i++;
                j++;
            }
            else if(arr1[i]<arr2[j]){
                i++;
            }
            else {
                j++;
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for(int i=0 ; i<n; i++){
            arr1[i]= sc.nextInt();
        }
        System.out.print("Enter the size of 2nd array: ");
        int m = sc.nextInt();
        int[] arr2 = new int[n];
        for(int i=0 ; i<m; i++){
            arr2[i]= sc.nextInt();
        }
        intersection(arr1,arr2);
    }
}
