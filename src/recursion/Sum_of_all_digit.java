package recursion;
import java.util.*;
public class Sum_of_all_digit {
    public static  int sum_of_digit(int input){
        if(input==0){
            return 0;
        }
        int smallans= sum_of_digit(input/10);
        return (input%10)+smallans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n= sc.nextInt();
        int result = sum_of_digit(n);
        System.out.println(result);
    }
}
