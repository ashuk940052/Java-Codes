package HashMaps;

import java.util.HashMap;
import java.util.Set;

public class Map_Use {

    public static void main(String[] args) {
        HashMap<String , Integer> map = new HashMap<>();
        // insert
        map.put("abc",1);
        map.put("def",2);
        map.put("abc1",1);
        map.put("def1",2);
         //size
        System.out.println("size : "+map.size());
        // check Presence
        if(map.containsKey("abc")){
            System.out.println( "Has abc");
        }
        if(map.containsKey("abc1")){
            System.out.println( "Has abc1");
        }
        //get value :- if map doesn't contain key value then it will return nullPointerExeption .
        // to overcome this sitution we need to check first then update the value
        int v = 0;
        if(map.containsKey("abc1")) {
            v = map.get("abc1");
        }
        System.out.println(v);
        // remove value
//        int s = map.remove("def");
//        System.out.println(s);

        Set<String> S = map.keySet();
        for(String str : S){
            System.out.println(str);
        }
    }
}
