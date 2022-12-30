import java.util.*;
public class Largest_Row_or_Column {
    public static void Findlargest(int[][] mat){

        int largestR = Integer.MIN_VALUE;
        int largestC = Integer.MIN_VALUE;
        int largest_row_index = 0;
        int largest_column_index = Integer.MIN_VALUE;

        int row = mat.length;
        int column = 0;
        if(row!=0){
            column = mat[0].length;
        }


        for(int i=0 ; i<row ; i++){
            int sum_r =0;
            for(int j=0; j<column ; j++){
                sum_r = sum_r + mat[i][j];
            }
            if(sum_r>largestR){
                largestR=sum_r;
                largest_row_index=i;
            }
        }
        for(int i=0 ; i<column ; i++){
            int sum_c =0;
            for(int j=0; j<row ; j++){
                sum_c = sum_c + mat[j][i];
            }
            if(sum_c>largestC){
                largestC=sum_c;
                largest_column_index=i;
            }
        }

        if(largestR>=largestC){
            System.out.println("row"+" "+largest_row_index+" "+largestR);
        }else{
            System.out.println("column"+" "+largest_column_index+" "+largestC);
        }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt(); // n = row
        int m = sc.nextInt();  // m = column
        int[][] arr = new int[n][m];
        for(int i =0 ; i<n ; i++){
            for(int j =0 ; j<m ; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        Findlargest(arr);
    }
}
