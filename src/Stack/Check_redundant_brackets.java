package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Check_redundant_brackets {
    public static boolean reduntant_brackets(String a){
        int count =0;
        int i=0;
        Stack<Character> stack = new Stack<>();
        while (i<a.length()-1){
            if(a.charAt(i) != ')'){
                stack.push(a.charAt(i));
                count++;
            }
            else {
                while (stack.peek()!= '('){
                    if (stack.peek() == '(' && count==0){
                        return true;
                    }
                    stack.pop();
                    count--;
                }
            }
            i++;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String a = sc.next();
        boolean ans = reduntant_brackets(a);
        System.out.print(ans);
    }
}
