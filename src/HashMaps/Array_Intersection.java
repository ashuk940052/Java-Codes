package HashMaps;
import java.util.*;

public class Array_Intersection {
     public  static  void Intersection(int[] arr1 , int[] arr2){
     HashMap<Integer,Integer> map = new HashMap<>();
         for (int j : arr1) {
             if (map.containsKey(j)) {
                 int value = map.get(j);
                 map.put(j, value + 1);
             } else {
                 map.put(j, 1);
             }
         }
         for (int j : arr2) {
             if (map.containsKey(j)) {
                 int fre = map.get(j);
                 if (fre > 0) {
                     System.out.println(j + " ");
                     map.put(j, fre - 1);
                 }
             }
         }
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of first Array : ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i=0 ; i< n1 ; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter the size of Second Array : ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i=0 ; i< n2 ; i++){
            arr2[i] = sc.nextInt();
        }
        Intersection(arr1,arr2);
    }
}
