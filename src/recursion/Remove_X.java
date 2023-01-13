package recursion;

import java.util.Scanner;

public class Remove_X {
    public static String remove(String str){
        if(str.length()==0){
            return str;
        }
        String ans = "";
        if(str.charAt(0) != 'x'){
            ans = ans +str.charAt(0);
        }
        String smallans = remove(str.substring(1));
        return ans + smallans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String input = sc.nextLine();
        String answer = remove(input);
        System.out.println(" The Removed String is : "+answer);
    }
}
