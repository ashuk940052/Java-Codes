package recursion;
import java.util.*;
public class Return_subsequences {
    public static  String[] FrindSubSequences(String str){
        if(str.length()==0){
            String[] ans = {""};
            return ans;
        } int k =0;
        String[] smallans = FrindSubSequences(str.substring(1));
        String[] ans = new String[2 * smallans.length];
        for (int i=0 ; i<smallans.length ; i++){
            ans[k]=smallans[i];
            k++;
        }
        for (int i=0 ; i<smallans.length;i++){
            ans[k] = str.charAt(0)+ smallans[i];
            k++;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.next();
        String[] ans = FrindSubSequences(str);
        for (int i=0 ;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }

    }
}
