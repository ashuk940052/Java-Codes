import java.util.*;
public class Print_Spiral {
    public static void print_Sprial(int[][] matrix){


        int rows = matrix.length;
        int cols = 0;
        if(rows!=0){
            cols = matrix[0].length;
        }

        int rs = 0;
        int cs = 0;
        int re = rows-1;
        int ce = cols-1;
        int count = 0;

        while(count<(rows * cols)){

            for(int i = cs; i<=ce; i++){
                System.out.print(matrix[rs][i] + " ");
                count++;
            }
            rs++;

            for(int i = rs; i<=re; i++){
                System.out.print(matrix[i][ce]+ " ");
                count++;
            }
            ce--;


            for(int i = ce; i>=cs; i--){
                System.out.print(matrix[re][i] + " ");
                count++;
            }
            re--;


            for(int i = re; i>=rs; i--){
                System.out.print(matrix[i][cs] + " ");
                count++;
            }
            cs++;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m=0;
        if(n!=0){
              m = sc.nextInt();
        }
        int[][] arr = new int[n][m];
        for (int i=0 ; i<n; i++){
            for (int j=0 ; j<m ;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        print_Sprial(arr);

    }
}
