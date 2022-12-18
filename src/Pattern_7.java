//0-1 TRIANGLE
/* To print such triangle we should check the Matrix (Position of all the element in that pyramid)
  1. if the sum of "i" and "j" indices will be even then print 1 in that particular column
  2.if the sum of "i" and "j" indices will be odd then print 0 in that particular column*/
public class Pattern_7 {
    public static void main(String[] args){
        int n=5;
        for(int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=i ;j++){
                if((i+j)%2==0)
                    System.out.print("1 ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }

    }
}
