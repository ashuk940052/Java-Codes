package Binary_Tree;

import java.io.FilterOutputStream;
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
                if(front.left==null){
                    System.out.print("L:-1");
                }else {
                    System.out.print("L:"+front.left.data);
                    pendingNode.enqueue(root.left);
                }
                if(front.right==null){
                    System.out.print(",R: -1");

                }else {
                    System.out.print(",R: "+front.right.data);
                    pendingNode.enqueue(root.right);
                }
                System.out.println();


            }
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
    public static  int count_Nodes(Binary_TreeNode<Integer> root){
        if(root == null){
            return 0;
        }
        int count = 1;
        count += count_Nodes(root.left);
        count += count_Nodes(root.right);
        return count;
    }
    public static int sum_of_all_Nodes(Binary_TreeNode<Integer> root){
        if(root == null){
            return 0;
        }
        int small_sum = sum_of_all_Nodes(root.left)+sum_of_all_Nodes(root.right);
        return small_sum +root.data;
    }
    public static boolean fint_x(Binary_TreeNode<Integer> root,int x){
        if (root==null){
            return false;
        }
        if(root.data == x){
            return true;
        }
        return (fint_x(root.left,x) || fint_x(root.right,x));
    }
    public static int Largest_node(Binary_TreeNode<Integer> root){
        if ( root == null ) {
            return -1;
        }
        int leftside = Largest_node(root.left);
        int rightside = Largest_node(root.right);
        return Math.max(root.data , Math.max(leftside , rightside));
    }
    public static int num_of_leafs(Binary_TreeNode<Integer> root){
        if(root == null){
            return 0;
        }
        if (root.left == null && root.right == null){
            return 1;
        }
        return num_of_leafs(root.left) + num_of_leafs(root.right);
    }
    public static void print_Depth_at_k(Binary_TreeNode<Integer> root ,int k){
        if (root ==null){
            return;
        }
        if(k == 0){
            System.out.print(root.data +" ");
            return;
        }
        print_Depth_at_k(root.left,k-1);
        print_Depth_at_k(root.right,k-1);
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Binary_TreeNode<Integer> root = new Binary_TreeNode<>(5);
//        Binary_TreeNode<Integer> leftNode = new Binary_TreeNode<>(4);
//        Binary_TreeNode<Integer> rightNode= new Binary_TreeNode<>(3);
//        root.left=leftNode;
//        root.right = rightNode;
//        System.out.println(root.data);
//        System.out.print(root.left.data+ " ");
//        System.out.println(root.right.data);
        Scanner s= new Scanner(System.in);
        Binary_TreeNode<Integer> root = takeInput_Levelwise();
        print_Binart_Tree(root);
        int count = count_Nodes(root);
        int sum_of_all_Nodes = sum_of_all_Nodes(root);
        int lasrgest_Node = Largest_node(root);
        int Number_of_leaf = num_of_leafs(root);
        System.out.println("Largest Node is : "+lasrgest_Node);
        System.out.println("Number of leaf is :" + Number_of_leaf);
        System.out.println("Number of node in the tree is :" + count);
        System.out.println("summ of all the nodes is :" + sum_of_all_Nodes);
        System.out.println("Enter the depth of Node You want : ");
        int depth = sc.nextInt();
        print_Depth_at_k(root,depth);
        System.out.print("Enter the element you want to search in Binary Tree : ");
        int X  = sc.nextInt();
        boolean find_X = fint_x(root,X);
        System.out.println(find_X);
    }
}
