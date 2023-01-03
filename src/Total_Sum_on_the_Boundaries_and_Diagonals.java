import java.util.*;
public class Total_Sum_on_the_Boundaries_and_Diagonals {
    public static void total_sum_diagolan_boundries(int[][] mat){
        int row = mat.length;

        int sum=0;
        for(int i=0 ; i<row ;i++){
          sum += mat[0][i];
          sum += mat[row-1][i];
         }
        for(int j=1 ; j<row-1 ;j++){
          sum += mat[j][0];
          sum += mat[j][row-1];
        }
        for(int i=1 ; i<row-1; i++){
            sum += mat[i][i];
            sum += mat[i][row-1-i];
        }
        if(row>4|| row == 3){
            sum-= mat[row/2][row/2];
        }
        System.out.println("total "+sum);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // n= row=column;
        int[][] arr = new int[n][n];
        for(int i =0; i<n ;i++){
            for(int j= 0 ; j<n ; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        total_sum_diagolan_boundries(arr);
    }
}
