package Binary_Tree;

import java.util.Scanner;
public class Largets_BST {

    public static  int Largest_BST_Sub_Tree(Binary_TreeNode<Integer> root){
        return Largest_BST_Sub_Tree_1(root).second.second;
    }
    public static Pair<Pair<Integer,Integer>,Pair<Boolean,Integer>> Largest_BST_Sub_Tree_1(Binary_TreeNode<Integer> root){
        if(root == null){
            Pair<Integer,Integer> innerPair1 = new Pair<>();
            Pair<Boolean,Integer> innerPair2 = new Pair<>();
            Pair<Pair<Integer,Integer>, Pair<Boolean,Integer>> ansPair = new Pair<>();
             innerPair1.first = Integer.MAX_VALUE;
             innerPair1.second = Integer.MIN_VALUE;
             innerPair2.first = true;
             innerPair2.second = 0;
             ansPair.first = innerPair1;
             ansPair.second = innerPair2;
             return ansPair;
            }
         Pair<Pair<Integer,Integer> , Pair<Boolean,Integer>> LeftansPair= Largest_BST_Sub_Tree_1(root.left);
         Pair<Pair<Integer,Integer> , Pair<Boolean,Integer>>  RightansPair= Largest_BST_Sub_Tree_1(root.right);
         Pair<Pair<Integer,Integer>, Pair<Boolean,Integer>> anspair = new Pair<>();
         Pair<Integer,Integer> Inner_Pair1 = new Pair<>();
         Pair<Boolean,Integer> Inner_Pair2 = new Pair<>();
         Inner_Pair1.first = Math.min(Math.min(LeftansPair.first.first,RightansPair.first.first), root.data);
         Inner_Pair1.second = Math.max(Math.max(LeftansPair.first.second,LeftansPair.first.second),root.data);
         Inner_Pair2.first = LeftansPair.second.first && RightansPair.second.first && (LeftansPair.first.first < root.data)
                 && (RightansPair.first.second > root.data) ;
         if (Inner_Pair2.first){
             Inner_Pair2.second = Math.max(LeftansPair.second.second,RightansPair.second.second)+1;
         }else {
             Inner_Pair2.second = Math.max(LeftansPair.second.second,RightansPair.second.second);
         }
         anspair.first = Inner_Pair1;
         anspair.second = Inner_Pair2;
         return anspair;
        }
    public static  Binary_TreeNode<Integer> takeInput_Levelwise(){
        Scanner sc = new Scanner(System.in);
        Queue_LL<Binary_TreeNode<Integer>> pending_Node = new Queue_LL<>();
        System.out.print("Enter Root data: ");
        int rootdata = sc.nextInt();
        if(rootdata==-1){
            return null;
        }
        Binary_TreeNode<Integer> root = new Binary_TreeNode<>(rootdata);
        pending_Node.enqueue(root);
        while (!pending_Node.isEmpty()){
            Binary_TreeNode<Integer> front ;
            try {
                front = pending_Node.dequeue();
            } catch (queue_Empty_Exeption e) {
                return null;
            }
            System.out.print("Enter left child data of "+front.data+" :");
            int left_child_data = sc.nextInt();
            if(left_child_data != -1){
                Binary_TreeNode<Integer> left_root = new Binary_TreeNode<>(left_child_data);
                pending_Node.enqueue(left_root);
                front.left = left_root;
            }
            System.out.print("Enter right child data of "+front.data+" :");
            int right_child_data = sc.nextInt();
            if(right_child_data != -1){
                Binary_TreeNode<Integer> right_root = new Binary_TreeNode<>(right_child_data);
                pending_Node.enqueue(right_root);
                front.right = right_root;
            }
        }
        return root;
    }

    public static void main(String[] args) {
        Binary_TreeNode<Integer> root = takeInput_Levelwise();
        int n = Largest_BST_Sub_Tree(root);
        System.out.println("Largest sub tree value "+n);
    }
}
