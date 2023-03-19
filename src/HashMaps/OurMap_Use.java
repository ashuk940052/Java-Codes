package HashMaps;

public class OurMap_Use {
    public static void main(String[] args) {
        Map<String ,Integer> map = new Map<>();
        for(int i=0 ; i<20  ; i++){
            map.insert("abc" + i , 1 + i );
            System.out.println("i: "+ i + " || LF : "+ map.load_Factor());
        }
        System.out.println("--------------------------------------------------------------------");
        map.removeValue("abc3");
        map.removeValue("abc10");
        for (int i=0 ; i< 20 ; i++){
            System.out.println("abc "+ i +" : "+map.getValue("abc"+i));
        }
    }
}
