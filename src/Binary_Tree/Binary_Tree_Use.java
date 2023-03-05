package Binary_Tree;

import java.util.Scanner;

public class Binary_Tree_Use {
    public static Binary_TreeNode<Integer> takeinput(Scanner s){
        int rootData ;
        System.out.println("Enter root Data : ");
        rootData = s.nextInt();
        if(rootData == -1){
            return null;
        }
        Binary_TreeNode<Integer> root = new Binary_TreeNode<>(rootData);
        root.left =takeinput(s);
        root.right = takeinput(s);
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
//        Binary_TreeNode<Integer> root = new Binary_TreeNode<>(5);
//        Binary_TreeNode<Integer> leftNode = new Binary_TreeNode<>(4);
//        Binary_TreeNode<Integer> rightNode= new Binary_TreeNode<>(3);
//        root.left=leftNode;
//        root.right = rightNode;
//        System.out.println(root.data);
//        System.out.print(root.left.data+ " ");
//        System.out.println(root.right.data);
        Scanner s= new Scanner(System.in);
        Binary_TreeNode<Integer> root = takeinput(s);
        print_Binart_Tree(root);
        s.close();
    }
}
