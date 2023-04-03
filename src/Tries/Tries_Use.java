package Tries;
public class Tries_Use {
    public static void main(String[] args) {
        Trie t = new Trie();
        t.add("this");
        t.add("new");
        t.add("news");
        System.out.println(t.search("new"));
        t.remove("new");
        System.out.println(t.search("new"));
        System.out.println(t.search("news"));

    }
}
