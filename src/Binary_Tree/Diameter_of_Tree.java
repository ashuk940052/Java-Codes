package Binary_Tree;
import java.util.Scanner;

public class Diameter_of_Tree {
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
        if(root == null){
            return 0;
        }
        int lh = hight(root.left);
        int rh = hight(root.right);
        return 1+Math.max(lh,rh);
    }
    public static int diameter(Binary_TreeNode<Integer> root){
        if (root == null){
            return 0;
        }
        int Option1 = hight(root.left) + hight(root.right);
        int Option2 = diameter(root.left);
        int Option3 = diameter(root.right);
        return Math.max(Option1,Math.max(Option2,Option3));
    }
    public static void main(String[] args) {
      Binary_TreeNode<Integer> root = takeInput_Levelwise();
      int diameter = diameter(root);
      System.out.println("Diamenter of Tree : " + diameter);
    }
}
