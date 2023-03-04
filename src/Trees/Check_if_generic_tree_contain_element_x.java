package Trees;
import java.util.*;

public class Check_if_generic_tree_contain_element_x {
    public static Tree_Node<Integer> takeInput_LevelWise(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter root data : ");
        int rootdata = sc.nextInt();
        Queue_LL<Tree_Node<Integer>> pending_Node = new Queue_LL<>();
        Tree_Node<Integer> root = new Tree_Node<>(rootdata);
        pending_Node.enqueue(root);
        while (!pending_Node.isEmpty()){
            try {
                Tree_Node<Integer> Front_Node = pending_Node.dequeue();
                System.out.print("Enter number of Children of " + Front_Node.Data +" : ");
                int Number_of_children = sc.nextInt();
                for (int i=0 ; i< Number_of_children ; i++){
                    System.out.print("Enter " + i +"th child of " + Front_Node.Data+" ");
                    int child = sc.nextInt();
                    Tree_Node<Integer> Child_Node = new Tree_Node<>(child);
                    Front_Node.childern.add(Child_Node);
                    pending_Node.enqueue(Child_Node);
                }
            } catch (queue_Empty_Exeption e) {
                // Shouldn't come here !!
                return null;
            }
        }
        return root;
    }
    public static boolean check_tree(Tree_Node<Integer> root , int x){
        if(root == null){
            return false;
        }
        if(root.Data == x) {
            return true;
        }
        for (int i=0; i<root.childern.size();i++){
            if(check_tree(root.childern.get(i),x))
             return true;
        }
        return false;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Element x : ");
    int x = sc.nextInt();
    Tree_Node<Integer> root = takeInput_LevelWise();
    boolean ans = check_tree(root,x);
        System.out.println(ans);
    }
}
