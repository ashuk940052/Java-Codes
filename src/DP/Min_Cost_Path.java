package DP;

public class Min_Cost_Path {
    public static int minCodstPath(int[][] arr ){
        return minCodstPath(arr,0,0);
    }
    //Minimun cast path from cell( i , j ) to cell ( m-1 , n-1 )
    public static int minCodstPath(int[][] arr ,int i , int j){
     int m = arr.length;
     int n = arr[0].length;

     if(i == m-1 && j == n-1){
         return arr[i][j];
     }
     if(i>=m || j>= n){
         return Integer.MAX_VALUE;
     }
     int option1 = minCodstPath(arr,  i ,j+1);
     int option2 = minCodstPath(arr,  i+1 ,j+1);
     int option3 = minCodstPath(arr,  i+1 ,j);

     return arr[i][j] + Math.min(option1,Math.min(option2,option3));
    }

    public static int minCodstPathM(int[][] arr ){
        int m = arr.length;
        int n = arr[0].length;
        int[][] storage = new int[m][n];

        for (int i=0; i< m ;i++){
            for(int j =0; j< n ;j++){
                storage[i][j]=-1;
            }
        }
        return minCodstPathM(arr,0,0, storage);
    }
    public static int minCodstPathM(int[][] arr ,int i, int j , int[][] storage){
        int m = arr.length;
        int n = arr[0].length;

        if(i == m-1 && j == n-1){
            storage[m-1][n-1] = arr[i][j];
            return storage[i][j];
        }
        if(i>=m || j>= n){
            return Integer.MAX_VALUE;
        }
        if(storage[i][j] !=-1){
            return storage[i][j];
        }
        int option1 = minCodstPathM(arr,  i ,j+1,storage);
        int option2 = minCodstPathM(arr,  i+1 ,j+1,storage);
        int option3 = minCodstPathM(arr,  i+1 ,j,storage);
         storage[i][j] = arr[i][j] + Math.min(option1,Math.min(option2,option3));
         return storage[i][j];
    }

//    public static int minCodstPathMDP(int[][] arr ){
//        int m = arr.length;
//        int n = arr[0].length;
//        int[][] storage = new int[m][n];
//
//        storage[m-1][n-1] = arr[m-1][n-1];
//
//    }
    public static void main(String[] args) {
    int[][] arr = {{1,1,1,},{4,5,2},{7,8,9}};
        System.out.println(minCodstPathM(arr));
        System.out.println(minCodstPath(arr));

    }
}
