package recursion;
import java.util.*;
public class Replace_pi {
    public static String replace(String input){
        if(input.length()==1 || input.length()==0)
            return input;
        String small_ans = replace(input.substring(1));
        if(small_ans.charAt(0)=='i' && input.charAt(0)=='p')
            small_ans = "3.14" + small_ans.substring(1);
        else
            small_ans = input.charAt(0)+small_ans;
        return  small_ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String :");
        String s = sc.next();
        String ans = replace(s);
        System.out.println(ans);

    }
}
