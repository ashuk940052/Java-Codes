package DP;
public class Longest_Common_SubSequencs {
//    public static int LCS(String s , String t){
//     if(s.length() ==0 || t.length() ==0){
//         return 0;
//     }
//     if(s.charAt(0)== t.charAt(0)){
//         return 1 + LCS(s.substring(1) , t.substring(1));
//     }else {
//         int option1 = LCS(s , t.substring(1));
//         int option2 = LCS(s.substring(1) , t);
//
//         return Math.max(option1,option2);
//     }
//    }
    public static int LCSDP(String s , String t){
        int[][] storage = new int[s.length()+1][t.length()+1];
        for(int i=0 ; i<s.length()+1;i++){
            for(int j = 0; j< t.length()+1 ; j++){
                storage[i][j] = -1;
            }
        }
        return LCS(s,t,storage);
    }
    public static int LCS(String s , String t,int[][] storage){
        int m = s.length();
        int n = t.length();

        if(storage[m][n] != -1){
            return storage[m][n];
        }
        if(m==0 || n ==0){
            storage[m][n] = 0;
            return storage[m][n];
        }
        if(s.charAt(0) == t.charAt(0)){
            storage[m][n] = 1+ LCS( s.substring(1) , t.substring(1) , storage );
        }else {
            int option1 =  LCS( s , t.substring(1) , storage );
            int option2 = LCS( s.substring(1) , t , storage );
            storage[m][n] = Math.max(option1,option2);
        }
        return storage[m][n];
    }
    public static void main(String[] args) {
        String s ="dgei";
        String t = "begi";
        System.out.println(LCSDP(s,t));
    }
}
