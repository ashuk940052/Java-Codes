import java.util.*;
public class Highest_Occuring_Character {
    public static char higest_occuring(String str){
        //Your code goes here

        int len = str.length();
        int[] freq = new int[255];
        int lena = freq.length;
        int max = 0;
        int maxi = 0;

        for(int i = 0; i<len; i++){
            int var = (int)str.charAt(i);
            freq[var]++;
        }

        for(int j = 0; j<lena; j++){
            if (freq[j]>max){
                max = freq[j];
                maxi = j;
            }
        }

        char ans = (char)maxi;

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char  last = higest_occuring(str);
        System.out.println(last);

    }
}
