import java.util.*;
public class Pattern_11{
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int i=1,j=1;
        System.out.println("*");
            while(i<=n){
                System.out.print("*");
                while(j<=i){
                    System.out.print(j);
                    j++;
                }j--;
                while(j>0){
                    if(j-1==0){
                        break;
                    }
                    System.out.print(j-1);
                    j--;
                }
                System.out.print("*");
                System.out.println();
                i++;
            }
            i=n-1;
            while(i>0){
                System.out.print("*");
               j=1;
                while(j<=i){
                    System.out.print(j);
                    j++;
                }
                j--;
                while(j>0){
                    if(j-1==0){
                        break;
                    }
                    System.out.print(j-1);
                    j--;
                }

                i--;
                System.out.print("*");
                System.out.println();

            }
        System.out.println("*");
        }
    }























