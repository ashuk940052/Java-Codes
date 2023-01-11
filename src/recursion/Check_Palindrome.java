package recursion;
import java.util.*;
public class Check_Palindrome {
    public static boolean Check(String s , int start , int end){
        if(start >= end){
            return true;
        }
        boolean check = true;
        if(s.charAt(start)==s.charAt(end)){
            check = Check(s , start+1, end-1);
        }else {
            check = false;
        }
        return check;
    }
   public static boolean Check(String s){
     int  start =0;
       int end = s.length()-1;
       return Check( s , start, end);
   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String s = sc.next();
        boolean ans = Check(s);
        System.out.print(ans);


    }
}
