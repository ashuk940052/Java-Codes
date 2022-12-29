import java.util.*;
public class Reverse_String_Wordwise {
    public static String reverseWordWise(String str) {
     int last_index=0;
     String ans = "";
     int i=0;
     for(;i<str.length();i++){
         int current_index= i;
         String rev = "";
         if(str.charAt(i)==' '){
             for(int j= current_index; j>=last_index;j--){
                 rev = str.charAt(j)+rev ;
             }
             ans = rev+ans ;
             last_index = i+1;
         }

     }
     int current_space= i;
     String rev ="";
        for(int j= current_space-1; j>=last_index;j--) {
            rev = str.charAt(j) + rev;
        }
        rev =rev+" ";
        ans = rev + ans;

        return ans;


      }
    public static void main(String[] args){
            Scanner s = new Scanner(System.in);
            String input = s.nextLine();
            System.out.println(reverseWordWise(input));
        }
    }

