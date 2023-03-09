package Binary_Tree;

import java.util.Scanner;

public class Check_BST {
    public static int maximum(Binary_TreeNode<Integer> root) {
        if(root == null){
            return Integer.MIN_VALUE;
        }
        return Math.max(root.data,Math.max(maximum(root.left) ,maximum(root.right)));
    }
    public static int minimum(Binary_TreeNode<Integer> root) {
        if(root == null){
            return Integer.MAX_VALUE;
        }
        return Math.min(root.data,Math.min(minimum(root.left), minimum(root.right)));
    }
    public static boolean isBST(Binary_TreeNode<Integer> root){
        if(root == null){
            return true;
        }
        int leftMax = maximum(root.left);
        int rightMin = minimum(root.right);
        if(root.data <= leftMax){
            return false;
        }
        if(root.data >= rightMin){
            return false;
        }
        boolean isLeft_BST = isBST(root.left);
        boolean isRight_BST = isBST(root.right);
        if(isLeft_BST && isRight_BST){
            return true;
        }else {
            return false;
        }
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
        boolean ans = isBST(root);
        System.out.println(ans);
    }
}
