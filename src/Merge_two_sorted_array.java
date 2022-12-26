import java.util.*;
public class Merge_two_sorted_array {

    public static int[] Merge_array(int[] arr1,int[] arr2){
     int i=0,j=0,k=0;
     int[] arr= new int[arr1.length+arr2.length];
     while(i<arr1.length && j<arr2.length){
         if(arr1[i]<arr2[j]){
             arr[k]=arr1[i];
             k++;
             i++;
         }
         else{
             arr[k]=arr2[j];
             k++;
             j++;
         }
     }

        while(i<arr1.length){
            arr[k]=arr1[i];
            k++;
            i++;
        }
        while(j<arr2.length){
            arr[k]=arr2[j];
            k++;
            j++;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        for(int i =0 ; i<n ; i++){
            arr1[i] = sc.nextInt();
        }
        for(int i =0 ; i<m ; i++){
            arr2[i] = sc.nextInt();
        }
       int[] ans= Merge_array(arr1,arr2);
        for (int an : ans) System.out.print(an + " ");
    }
}
