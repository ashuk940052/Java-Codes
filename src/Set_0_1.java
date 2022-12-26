import java.util.*;
public class Set_0_1 {
    public static void set(int[] arr){
        int count0 =0;
        int p=arr.length;
        int[] arrn =new int[p];
        for (int j : arr) {
            if (j == 0) {
                count0++;
            }
        }
        for(int i = 0; i<count0 ; i++){
            arrn[i]=0;
        }
        for (int i =count0 ; i<p ; i++){
            arrn[i]=1;
        }
        for (int i =0; i<p ; i++){
            System.out.print(arrn[i]+"");
        }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for( int i=0 ; i<n ; i++){
            arr[i]= sc.nextInt();

        }  set(arr);
    }

}
