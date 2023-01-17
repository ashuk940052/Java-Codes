package recursion;
import java.util.*;
public class PrintSubsequences {
   public static void printSusbsequences(String input , String outputSoFar){
       if(input.length()==0){
           System.out.println(outputSoFar+" ");
           return;
       }
       printSusbsequences(input.substring(1),outputSoFar);
       printSusbsequences(input.substring(1),outputSoFar+input.charAt(0));
   }
    public static void printSubsequence(String input){
       printSusbsequences(input,"");
   }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
       String Str = sc.next();
      printSubsequence(Str);
   }
}
