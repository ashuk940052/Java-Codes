package generics;
import java.util.*;
import vehicle.vehicle ;
public class Print_array {
    public static<T extends print_Interface> void print(T[] arr){
        for(int i=0; i<arr.length; i++){
           arr[i].print();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer[] arr = new Integer[10];
        for (int i=0 ; i<arr.length;i++){
            arr[i] = i+1;
        }
        String[] S = new String[10];
        for (int i=0; i<arr.length;i++){
            S[i] ="abc"+i;
        }
        vehicle[] v = new vehicle[10];
        for(int i =0 ; i<v.length;i++){
            v[i] = new vehicle(10);
        }
        awesome_Students[] s = new awesome_Students[10];
        for(int i =0 ; i<v.length;i++){
            s[i] = new awesome_Students();
        }
        print(s);
        print(v);
//        print(arr);
//        print(S);
    }
}
