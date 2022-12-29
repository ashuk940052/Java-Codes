import java.util.*;
public class Reverse_String_Wordwise {
    public static String reverseWordWise(String str) {
     int last_index=0;
     StringBuilder ans = new StringBuilder();
     int i=0;
     for(;i<str.length();i++){
         StringBuilder rev = new StringBuilder();
         if(str.charAt(i)==' '){
             for(int j = i; j>=last_index; j--){
                 rev.insert(0, str.charAt(j));
             }
             ans.insert(0, rev);
             last_index = i+1;
         }

     }
     int current_space= i;
     StringBuilder rev = new StringBuilder();
        for(int j= current_space-1; j>=last_index;j--) {
            rev.insert(0, str.charAt(j));
        }
        rev.append(" ");
        ans.insert(0, rev.toString());

        return ans.toString();


      }
    public static void main(String[] args){
            Scanner s = new Scanner(System.in);
            String input = s.nextLine();
            System.out.println(reverseWordWise(input));
        }
    }

