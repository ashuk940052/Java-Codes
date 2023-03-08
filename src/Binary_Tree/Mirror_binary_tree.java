package Binary_Tree;

import java.util.Scanner;

public class Mirror_binary_tree {
    public static void Mirror_of_Binary(Binary_TreeNode<Integer> root){
        if(root == null){
            return;
        }
        Binary_TreeNode<Integer> temp = root.left;
        root.left = root.right;
        root.right = temp;
        Mirror_of_Binary(root.left);
        Mirror_of_Binary(root.left);
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
    public static void print_Binart_Tree(Binary_TreeNode<Integer> root){
        if (root == null){
            System.out.println("No Data");
            return;
        }
        String ToBe_printed = root.data +" ";
        if (root.left != null){
            ToBe_printed += "L:"+root.left.data +",";
        }
        if (root.right != null){
            ToBe_printed += "R:"+root.right.data ;
        }
        System.out.println(ToBe_printed);
        print_Binart_Tree(root.left);
        print_Binart_Tree(root.right);
    }
    public static void main(String[] args) {
        Binary_TreeNode<Integer> root = takeInput_Levelwise();
        print_Binart_Tree(root);
        System.out.println("------------------------------ AFTER MIRROR ----------------------------------------");
        Mirror_of_Binary(root);
        print_Binart_Tree(root);
    }
}
