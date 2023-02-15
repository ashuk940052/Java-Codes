package Stack;
import java.util.Scanner;
import java.util.Stack;
public class Balanced_Parenthesis {
    public static boolean isbalanced_Para(String s ){
        if (s.length()==0){
            return true;
        }
        Stack<Character> stack = new Stack<>();
        for (int j =0 ; j<s.length();j++ ){
            char i = s.charAt(j);
            if(i == '(' || i=='[' || i== '{'){
                stack.push(i);
            }else if(i == ')' || i==']' || i=='}'){
                if (stack.isEmpty()){
                    return false;
                }else {
                    if(i==')'){
                        if (stack.peek() != '('){
                            return false;
                        }else {
                            stack.pop();
                        }

                        } else if (i == '}') {
                        if (stack.peek()!= '{'){
                            return false;
                        }else {
                            stack.pop();
                        }
                }else if(i == ']'){
                        if (stack.peek() != '['){
                            return false;
                        }else {
                            stack.pop();
                        }
                    }
                }
            }

        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String a = sc.next();
        boolean ans = isbalanced_Para(a);
        System.out.print(ans);

    }
}
