package Binary_Tree;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Root_To_Node_Path {
    public static ArrayList<Integer> get_Root_To_Node(Binary_TreeNode<Integer> root , int data){
        if(root == null ){
            return null;
        }
        if(root.data == data){
            ArrayList<Integer> output = new ArrayList<>();
            output.add(root.data);
            return output;
        }
        ArrayList<Integer> Left_Output = get_Root_To_Node(root.left,data);
        if(Left_Output != null){
            Left_Output.add(root.data);
            return Left_Output;
        }
        ArrayList<Integer> Right_Output = get_Root_To_Node(root.right,data);
        if (Right_Output != null) {
            Right_Output.add(root.data);
            return Right_Output;
        }else {
            return null;
        }
    }
    public static ArrayList<Integer> get_Root_To_Node_BST(Binary_TreeNode<Integer> root ,int data){
        if(root == null){
            return null;
        }
        if(root.data == data){
            ArrayList<Integer> Output = new ArrayList<>();
            Output.add(root.data);
            return Output;
        }
        if(data < root.data){
            ArrayList<Integer> Left_output = get_Root_To_Node_BST(root.left,data);
            if(Left_output != null){
                Left_output.add(root.data);
                return Left_output;
            }
        }
        if(data > root.data){
            ArrayList<Integer> Right_output = get_Root_To_Node_BST(root.right,data);
            if(Right_output != null){
                Right_output.add(root.data);
                return Right_output;
            }
        }
        return null;
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
        System.out.print("Enter the data Who's Path you want : ");
        int data = sc.nextInt();
        ArrayList<Integer> ans = get_Root_To_Node(root,data);
        System.out.print("<");
        for (int i =0 ; i< ans.size() ; i++){
            System.out.print( ans.get(i) +",");
        }
        System.out.print(">");
        System.out.println();
        System.out.println("---------------------------------TRY WITH BST --------------------------------------");

        Binary_TreeNode<Integer> root2 = takeInput_Levelwise() ;
        System.out.print("Enter the data Who's Path you want : ");
        int data2 = sc.nextInt();
        ArrayList<Integer> ans2 = get_Root_To_Node_BST(root,data);
        System.out.print("<");
        for (int i =0 ; i< ans2.size() ; i++){
            System.out.print( ans2.get(i) +",");
        }
        System.out.print(">");

    }
}
