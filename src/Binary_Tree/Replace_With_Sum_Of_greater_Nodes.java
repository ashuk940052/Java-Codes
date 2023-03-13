package Binary_Tree;

import java.util.Scanner;

public class Replace_With_Sum_Of_greater_Nodes {
    public static void sum_With_Greater_Nodes(Binary_TreeNode<Integer> root){
        Sum_With_Greater_Nodes_Helper(root,0);
    }
    public static int Sum_With_Greater_Nodes_Helper(Binary_TreeNode<Integer> root , int sum){
        if(root == null){
            return 0;
        }
        int Sum_with_greater_Node= Sum_With_Greater_Nodes_Helper(root.right,sum);
        int temp  = root.data;
        root.data = Sum_with_greater_Node + sum;
        int leftSum = Sum_With_Greater_Nodes_Helper(root.left,root.data);
        return leftSum + Sum_with_greater_Node + temp;
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
    public static void print_Binary_Tree_levelwise(Binary_TreeNode<Integer> root){
        if (root==null){
            return;
        }
        Queue_LL<Binary_TreeNode<Integer>> pendingNode = new Queue_LL<>();
        pendingNode.enqueue(root);

        while (!pendingNode.isEmpty()){
            Binary_TreeNode<Integer> front ;
            try {
                front = pendingNode.dequeue();
            } catch (queue_Empty_Exeption e) {
                return;
            }
            if (front != null){
                System.out.print(front.data+" :");
                if(front.left == null){
                    System.out.print("L:-1");

                }else {
                    System.out.print("L:"+front.left.data);
                    pendingNode.enqueue(front.left);
                }
                if(front.right == null){
                    System.out.print(",R: -1");


                }else {
                    System.out.print(",R: "+front.right.data);
                    pendingNode.enqueue(front.right);
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Binary_TreeNode<Integer> root = takeInput_Levelwise();
        sum_With_Greater_Nodes(root);
        print_Binary_Tree_levelwise(root);
    }
}
