package Data_Structures;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(20);
        list1.add(30);
        list1.add(0,10);
        System.out.println(list1.get(0));
        System.out.println(list1.size());
        for (int i= list1.size();  i<10 ; i++){
            list1.add(i , list1.get(i-1)+10);
        }
        for (int ele : list1) {
            System.out.print(ele + " ");
        }
       // list1.remove(5);
        list1.set(5,600);
        System.out.println(" ");
        for (int ele : list1) {
            System.out.print(ele + " ");
        }
    }
}
