package Binary_Tree;

import java.util.Scanner;

public class Binary_Search_Tree {
    public static boolean BST(Binary_TreeNode<Integer> root , int s){
        if(root == null){
            return false;
        }
        boolean ans = true;
        if (root.data == s){
            return ans;
        }
        if (root.data > s ){
            ans = BST(root.left,s);
        }else {
            ans = BST(root.right,s);
        }
        return ans;
    }
    public static void print_IN_Range(Binary_TreeNode<Integer> root , int min , int max){
        if(root == null){
            return;
        }
        if (min < root.data){
            print_IN_Range(root.left , min , max);
        }
        if(root.data >= min && root.data <= max){
            System.out.print(root.data+" ");
        }
        if(max > root.data){
            print_IN_Range(root.right,min , max);
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
        Scanner sc = new Scanner(System.in);
        Binary_TreeNode<Integer> root = takeInput_Levelwise();
        System.out.println("Enter the element you want to search : ");
        int S = sc.nextInt();
        boolean ans = BST(root,S);
        System.out.println(ans);
        System.out.println("To print in range : ");
        System.out.println("Enter the min and max element ");
        int min = sc.nextInt();
        int max = sc.nextInt();
        print_IN_Range(root,min,max);
    }
}
