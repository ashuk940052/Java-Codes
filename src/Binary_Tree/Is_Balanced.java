package Binary_Tree;

import java.awt.desktop.PreferencesEvent;
import java.util.Scanner;

public class Is_Balanced {
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
    public static int hight(Binary_TreeNode<Integer> root){
        if (root == null){
            return 0;
        }
        int Small_Left_Output = hight(root.left);
        int Small_right_Output = hight(root.right);
        if (Small_Left_Output > Small_right_Output){
            return 1 + Small_Left_Output;
        }else {
            return 1 + Small_right_Output;
        }
    }
    public static boolean isbalanced(Binary_TreeNode<Integer> root){
        if (root == null){
            return true;
        }
        int Small_Left_Balanced = hight(root.left);
        int Small_Right_Balanced = hight(root.right);
        if(Math.abs(Small_Left_Balanced - Small_Right_Balanced) >1){
            return false;
        }
        boolean Is_Left_Balance = isbalanced(root.left);
        boolean Is_Right_Balanced = isbalanced(root.right);

        return Is_Left_Balance && Is_Right_Balanced;
    }
    public static Balanced_Tree_return Is_Balnaced_better_code(Binary_TreeNode<Integer> root){
        if(root == null){
            int hight =0;
            boolean isbal = true;
            Balanced_Tree_return ans = new Balanced_Tree_return();
            ans.hight=hight;
            ans.Is_Balanced = isbal;
            return ans;
        }

        Balanced_Tree_return left_Output = Is_Balnaced_better_code(root.left);
        Balanced_Tree_return right_Output = Is_Balnaced_better_code(root.right);
        boolean isbal = true;
        int hight = 1 + Math.max(left_Output.hight,right_Output.hight);

        if (Math.abs(left_Output.hight - right_Output.hight) > 1){
            isbal = false;
        }
        if (!left_Output.Is_Balanced || !right_Output.Is_Balanced){
            isbal = false;
        }

        Balanced_Tree_return ans = new Balanced_Tree_return();
        ans.hight =hight;
        ans.Is_Balanced = isbal;
        return ans;
    }
    public static void main(String[] args) {
      Binary_TreeNode<Integer> root = takeInput_Levelwise();
      boolean ans = isbalanced(root);
        System.out.println(ans);
    }
}
