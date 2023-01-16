package recursion;

import java.util.Scanner;

public class Remove_Duplicates {
    public static  String remove(String input){
        if(input.length()==1){
            return input;
        }
        String small =remove(input.substring(1));
        if(input.charAt(0)==small.charAt(0)){
            return small;
        }
        else {
            return input.charAt(0)+small;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String :");
        String s = sc.nextLine();
        String answer = remove(s);
        System.out.println("The String after remove duplicates :"+answer);

    }
}
