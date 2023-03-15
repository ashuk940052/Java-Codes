package Binary_Tree;

import java.util.Scanner;

public class Print_Nodes_At_distance_K_from_N {
    public static void Node_At_distance_K(Binary_TreeNode<Integer> root , int node , int k){
        Node_At_distance_K_form_N_Distance(root,node,k);
    }
    public static int Node_At_distance_K_form_N_Distance(Binary_TreeNode<Integer> root , int node , int k){
        if(root == null){
            return -1;
        }
        if(root.data == node){
           Print_Node_down(root,k);
           return 0;
        }
        int Left_Hight = Node_At_distance_K_form_N_Distance(root.left, node,k);
        if(Left_Hight !=-1){
            if(Left_Hight == k){
                System.out.println(root.data);
            }else {
                Print_Node_down(root.right,k-Left_Hight-2);
            }
            return Left_Hight+1;
        }
        int Right_Hight = Node_At_distance_K_form_N_Distance(root.right, node,k);
        if(Right_Hight !=-1){
            if(Right_Hight == k){
                System.out.println(root.data);
            }else {
                Print_Node_down(root.left,k-Left_Hight-2);
            }
            return Right_Hight+1;
        }
        return -1;
    }
    private static void Print_Node_down(Binary_TreeNode<Integer> root , int k){
        if(root== null){
            return;
        }
        if (k==0){
            System.out.println(root.data);
            return;
        }
        Print_Node_down(root.left,k-1);
        Print_Node_down(root.right,k-1);
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
        Scanner sc =new Scanner(System.in);
        Binary_TreeNode<Integer> root = takeInput_Levelwise();
        System.out.print("Enter the node From Which you want distance : ");
        int Node = sc.nextInt();
        System.out.print("Enter the Distance = ");
        int k = sc.nextInt();
        Node_At_distance_K(root,Node,k);
    }
}
