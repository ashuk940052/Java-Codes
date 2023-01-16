package recursion;
import java.util.*;
public class Quick_sort_algorithm {
    public static  void quick_sort(int[] input , int si , int ei){
        if(si>=ei){
            return;
        }
        int pivotpos = partition(input , si , ei);
        quick_sort(input , si , pivotpos-1);
        quick_sort(input,pivotpos+1,ei);
    }
    public static int partition(int[] input , int si , int ei ){
        int pivot = input[si];
        int count =0;
        for(int i= si+1 ;i<ei; i++){
            if(input[i]<pivot){
                count++;
            }
        }
        int temp = input[si+count];
        input[si+count] = pivot;
        input[si]=temp;
        int i=si ;
        int j= ei ;
        while (i<j){
            if(input[i]<pivot){
                i++;
            }
            else if (input[j]>=pivot){
                j--;
            }
            else {
                temp = input[i];
                input[i]=input[j];
                input[j]=temp;
                i++;
                j--;
            }

        }
        return  si +count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i<n ;i++){
            arr[i]=sc.nextInt();
        }
        quick_sort(arr , 0 , n-1);
        for (int i=0 ; i<n ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
