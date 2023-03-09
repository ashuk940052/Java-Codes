package Binary_Tree;

import java.util.Scanner;

public class Cunstruct_BST_From_Array {
    public static Binary_TreeNode<Integer> Sorted_Array_To_Binary(int[] arr , int Start , int End){
        if(Start>End){
            return null;
        }
        int Mid_Data = Start + (End-Start)/2;
        Binary_TreeNode<Integer> root = new Binary_TreeNode<>(arr[Mid_Data]);
        root.left = Sorted_Array_To_Binary(arr,Start,Mid_Data-1);
        root.right = Sorted_Array_To_Binary(arr,Mid_Data+1,End);
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
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0 ; i<=n-1; i++ ){
            arr[i] = sc.nextInt();
        }
        Binary_TreeNode<Integer> root = Sorted_Array_To_Binary(arr,0,n-1);
        print_Binary_Tree_levelwise(root);

    }
}
