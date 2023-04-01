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
           root.childCount++;
        }
        add(child,word.substring(1));
    }
    private  boolean search(Trie_Node root , String word){
        if(word.length() ==0){
            return root.isTerminating;
        }
        int childIndex = word.charAt(0)-'a';
        Trie_Node child = root.children[childIndex];
        if(child == null){
            return false;
        }
        return search(child,word.substring(1));
    }
    private  void remove(Trie_Node root , String word){
        if(word.length() ==0){
            root.isTerminating = false;
            return;
        }
        int childIndex = word.charAt(0)-'a';
        Trie_Node child = root.children[childIndex];
        if(child == null){
            return ;
        }
        remove(child,word.substring(1));
        if(!child.isTerminating && root.childCount == 0){
            root.children[childIndex] =null;
            child = null;
            root.childCount--;

        }
        //        if(!child.isTerminating){
//            int numChild = 0;
//            for (int i=0 ; i<26 ;i++){
//                if(child.children[i] != null){
//                    numChild++;
//                }
//            }
//            if(numChild == 0){
//                root.children[childIndex] =null;
//                child = null;
//                root.childCount--;
//            }
//        }

    }
    public void add(String word){
      add(root,word);
    }
    public void remove(String word){
        remove(root , word);
    }
    public boolean search(String word){
        return search(root , word);
    }

}
class Trie_Node{
    char data;
    boolean isTerminating;
    Trie_Node children[];
    int childCount;
    public Trie_Node(char data){
        this.data = data;
        isTerminating = false;
        children = new Trie_Node[26];
        childCount =0;
    }
}
