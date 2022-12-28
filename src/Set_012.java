import java.util.*;
public class Set_012 {
    public static void set_012(int[] arr){
        int nZ=0,nT=arr.length-1;
        int tempforTwo;
        int tempforZero;
        int i=0;
        while(i<=nT){
            if(arr[i]==0){
                tempforZero=arr[nZ];
                arr[nZ]=arr[i];
                arr[i]=tempforZero;
                i++;
                nZ++;
            }
            else  if(arr[i]==2){
                tempforTwo=arr[nT];
                arr[nT]=arr[i];
                arr[i]=tempforTwo;
                nT--;
            }
            else
                i++;
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i]= sc.nextInt();
        }
        set_012(arr);
        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i]);
        }

    }
}
