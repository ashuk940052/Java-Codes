package Tries;
public class Trie {
    public Trie_Node root;
    public Trie(){
        root = new Trie_Node('\0');
    }
    private void add(Trie_Node root , String word){
        if(word.length() ==0){
            root.isTerminating=true;
            return;
        }
        int childIndex = word.charAt(0)-'a';
        Trie_Node child = root.children[childIndex];
        if(child == null){
            child = new Trie_Node(word.charAt(0));
            root.children[childIndex]=child;
        }
        add(child,word.substring(1));
    }
    public void add(String word){
      add(root,word);
    }

}
class Trie_Node{
    char data;
    boolean isTerminating;
    Trie_Node children[];
    public Trie_Node(char data){
        this.data = data;
        isTerminating = false;
        children = new Trie_Node[26];
    }
}
