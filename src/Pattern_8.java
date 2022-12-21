import java.util.*;
public class Pattern_8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = n; i>=1 ; i--){
            int ch =64;
            for(int j =i ; j<=n ; j++){

                System.out.print((char)(j+ch));

            }

            System.out.println();
        }
    }
}
