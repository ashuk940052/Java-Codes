package recursion;
import java.util.*;
public class Merge_sort_Function {
   public static  void merg(int[] input){
       if(input.length<=1){
           return;
       }
       int[] b = new int[input.length/2];
       int[] c = new int[input.length-b.length];
       System.arraycopy(input, 0, b, 0, input.length / 2);
       if (input.length - input.length / 2 >= 0)
           System.arraycopy(input, input.length / 2, c, 0, input.length - input.length / 2);
       merg(b);
       merg(c);
       merg_sort(b,c,input);
   }
   public static void merg_sort(int[] s1 , int[] s2 , int[] d){
       int i=0 , j=0 , k=0;
       while (i<s1.length && j<s2.length){
           if(s1[i]<=s2[j]){
               d[k]=s1[i];
               i++;
           }
           else {
               d[k]=s2[j];
               j++;

           }
           k++;
       }
       if(i<s1.length){
           while (i<s1.length){
               d[k]=s1[i];
               i++;
               k++;
           }
       }
       if(j<s2.length){
           while (j<s2.length){
               d[k]=s2[j];
               j++;
               k++;
           }
       }
   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0 ; i<n ; i++){
            arr[i]=sc.nextInt();
        }
        merg(arr);
        for (int i=0 ; i<n ;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
