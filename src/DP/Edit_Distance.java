package DP;

public class Edit_Distance {
    public static int Edit_DistanceR(String s , String t){
        if(s.length()==0){
            return t.length();
        }if(t.length() == 0){
            return s.length();
        }
        if(s.charAt(0) == t.charAt(0)){
           return Edit_DistanceR(s.substring(1),t.substring(1));
        }else{
            // Insert
            int option1 = Edit_DistanceR( s , t.substring(1) );
            // Delete
            int option2 = Edit_DistanceR(s.substring(1),t);
            // Substitute
            int option3 = Edit_DistanceR(s.substring(1),t.substring(1));
            return 1 + Math.min(option1,Math.min(option2,option3));
        }

    }
    public static int Edit_DistanceM(String s , String t){
      int m = s.length();
      int n = t.length();
      int[][] storage = new int[m+1][n+1];
       for(int i=0 ; i<= m ; i++){
           for(int j=0 ; j<= n ; j++){
                      storage[i][j] =-1;
           }
       }
       return Edit_DistanceM(s , t , storage);
    }
    public static int Edit_DistanceM(String s , String t , int[][] storage){
        int m = s.length();
        int n = t.length();
        if(storage[m][n] != -1){
            return storage[m][n];
        }
        if(m == 0){
            storage[m][n] = n;
            return storage[m][n];
        }
        if(n == 0){
            storage[m][n] = m;
            return storage[m][n];
        }
        if(s.charAt(0) == t.charAt(0)){
            storage[m][n] = Edit_DistanceM(s.substring(1),t.substring(1),storage);
        }else{
            // Insert
            int option1 = Edit_DistanceM( s , t.substring(1) ,storage );
            // Delete
            int option2 = Edit_DistanceM(s.substring(1),t,storage);
            // Substitute
            int option3 = Edit_DistanceM(s.substring(1),t.substring(1),storage);
            storage[m][n] = 1 + Math.min(option1,Math.min(option2,option3));
        }
        return storage[m][n];
    }


    public static void main(String[] args) {
     String s = "ade";
     String t = "gbe";
        System.out.println(Edit_DistanceM(s,t));
        System.out.println(Edit_DistanceR(s,t));
    }
}
