import java.util.*;
public class Selection_Sort {
    public static void selection_sort(int[] arr){
        for(int i =0 ; i<arr.length-1 ; i++){
            int min=arr[i];
            int minIndex =i;
            for(int j= i+1; j< arr.length ; j++){
                if(arr[j]<min){
                    min = arr[j];
                    minIndex =j;
                }
            }
            if(minIndex != i){
            arr[minIndex]=arr[i];
            arr[i]=min;}
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i =0 ; i<n ; i++){
           arr[i] = sc.nextInt();
        }
        selection_sort(arr);
        for(int i =0 ; i<n ; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
