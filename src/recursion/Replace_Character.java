package recursion;

import java.util.Scanner;

public class Replace_Character {
    public static String replace(String input , char c1 , char c2){
        if(input.length()==0){
            return input;
        }
        String ans = "";
        if(input.charAt(0)==c1){
            ans = ans + c2;
        }else {
            ans = ans + input.charAt(0);
        }
        String smallans = replace(input.substring(1),c1,c2);
        return ans + smallans;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the String : ");
        String s = sc.nextLine();
        System.out.print("Enter the Character you want to replace : ");
        String n = sc.next();
            char  mainChar= n.charAt(0);
        System.out.print("Enter the Character you want to replace with ");
        String x = sc.next();
           char Replacwith = x.charAt(0);
           String answer = replace(s , mainChar,Replacwith);
        System.out.print(answer);
    }
}
