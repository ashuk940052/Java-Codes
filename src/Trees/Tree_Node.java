package Trees;
import java.util.ArrayList;

public class Tree_Node<T> {
    public T Data;
    public ArrayList<Tree_Node<T>> childern;

    public Tree_Node(T Data){
        this.Data = Data;
        childern = new ArrayList<>();
    }
}
