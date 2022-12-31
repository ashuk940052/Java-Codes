import java.util.*;
public class Print_Like_a_Wave {
    public static void wave_print(int[][] mat){
        int row=mat.length;
        int column = 0;
        if(row!= 0){
            column = mat[0].length;
        }
        for(int i=0 ;i<column ; i++){
            if(i%2 == 0){
                for (int j=0 ; j<row ; j++){
                    System.out.print(mat[j][i]+" ");
                }
            }
            else{
                for (int j=row-1 ; j>=0 ;j--){
                    System.out.print(mat[j][i]+" ");
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();   // n = row;
        int m =sc.nextInt();  //  m = column ;
        int[][] arr = new int[n][m];
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j< m ; j++){
             arr[i][j]= sc.nextInt();
            }
        }
        wave_print(arr);
    }
}
