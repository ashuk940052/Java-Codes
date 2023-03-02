package Trees;


import com.sun.source.tree.Tree;

import java.util.*;

public class Tree_Use {
    public static Tree_Node<Integer> takeinput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter next node data ");
        int n = sc.nextInt();
        Tree_Node<Integer> root = new Tree_Node<>(n);
        System.out.print("Enter number of child for : "+ n+ " ");
        int child_count = sc.nextInt();
        for (int i=0; i<child_count ; i++){
            Tree_Node<Integer> child = takeinput();
            root.childern.add(child);
        }
        return root;
    }
    public static void print(Tree_Node<Integer> root){
        String s= root.Data +":";
        for (int i=0; i<root.childern.size();i++){
            s = s + root.childern.get(i).Data+",";
        }
        System.out.println(s);
        for (int i=0; i<root.childern.size();i++){
          print(root.childern.get(i));
        }

    }
    public static Tree_Node<Integer> takeInput_LevelWise(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter root data :  ");
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
                    System.out.print("Enter " + i +"th child of " + Front_Node.Data+"");
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
//    public static  void print_LevelWise(){
//
//    }

    public static void main(String[] args) {
//        Tree_Node<Integer> root = new Tree_Node<Integer>(4);
//        Tree_Node<Integer> node1 = new Tree_Node<Integer>(2);
//        Tree_Node<Integer> node2 = new Tree_Node<Integer>(3);
//        Tree_Node<Integer> node3 = new Tree_Node<Integer>(5);
//        Tree_Node<Integer> node4 = new Tree_Node<Integer>(6);
//
//        root.childern.add(node1);
//        root.childern.add(node2);
//        root.childern.add(node3);
//        node2.childern.add(node4);
//        System.out.println(root);

        Tree_Node<Integer> root = takeInput_LevelWise();
        print(root);

    }
}
