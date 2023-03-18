package HashMaps;

public class OurMap_Use {
    public static void main(String[] args) {
        Map<String ,Integer> map = new Map<>();
        for(int i=0 ; i< 20 ; i++){
            map.insert("abc" + i , 1 + i );
            System.out.println("i: "+ i + " || LF : "+ map.load_Factorr());
        }
    }
}
