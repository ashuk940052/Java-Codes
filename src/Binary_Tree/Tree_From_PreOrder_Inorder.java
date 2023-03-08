package Binary_Tree;

import jdk.jshell.spi.SPIResolutionException;

import java.util.Scanner;

public class Tree_From_PreOrder_Inorder {
    public static void print_Binary_Tree(Binary_TreeNode<Integer> root){
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
        print_Binary_Tree(root.left);
        print_Binary_Tree(root.right);
    }
    public static Binary_TreeNode<Integer> BuiltTree(int[] Inorder , int[] Preorder){
        return BuiltTreeHelper(Inorder,Preorder,0,Inorder.length-1, 0 ,Preorder.length-1);
    }
    public static Binary_TreeNode<Integer> BuiltTreeHelper(int[] In , int[] Pre, int Ins , int Ine,int PreS,int PreE){
           if(Ins >Ine){
               return null;
           }
       int rootdata = Pre[PreS];
           Binary_TreeNode<Integer> root = new Binary_TreeNode<>(rootdata);
           int rootIndex = -1;
           for (int i=0 ; i<=In.length ; i++){
               if (In[i] == rootdata){
                   rootIndex = i;
                   break;
               }
           }

           if (rootIndex == -1){
               return null;
           }
           int left_In_S = Ins;
           int left_In_E = rootIndex-1;
           int left_pre_S = PreS +1 ;
           int left_pre_E = left_In_E - left_In_S + left_pre_S;
           int right_In_S = rootIndex +1 ;
           int right_In_E = Ine;
           int right_pre_S = left_pre_E + 1;
           int right_pre_E = PreE;
           root.left = BuiltTreeHelper( In , Pre, left_In_S,left_In_E,left_pre_S, left_pre_E);
           root.right = BuiltTreeHelper(In , Pre, right_In_S,right_In_E,right_pre_S,right_pre_E);
           return root;
    }
    public static void main(String[] args) {
     int[] Inorder = {4,2,5,1,3,7};
     int[] Preorder = {1,2,4,5,3,7};
     Binary_TreeNode<Integer> root = BuiltTree(Inorder, Preorder);
     print_Binary_Tree(root);
    }
}
