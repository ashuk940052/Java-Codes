package generics;

public class pair_use {
    public static void main(String[] args) {
        pair<Integer,Integer> p = new <Integer>pair(29,26);
        p.setFirst(88);
        System.out.println(p.getFirst());
        p.setSecond(66);
        System.out.println(p.getSecond());
        pair<String,String> p1 = new pair<String,String>("Prashant","Priya");
        System.out.println(p1.getFirst());
        System.out.println(p1.getSecond());
        int a =29;
        int b= 26 ;
        int c= 30;
        pair<Integer,Integer> Internal_pair = new pair<>(a,b);
        pair<pair<Integer,Integer>,Integer> p3 = new pair<>(Internal_pair,c);
        System.out.println(Internal_pair.getFirst()+" "+ Internal_pair.getSecond());
        System.out.println(p3.getFirst().getFirst()+" "+ p3.getFirst().getSecond());
        System.out.println(p3.getSecond());


    }
}
