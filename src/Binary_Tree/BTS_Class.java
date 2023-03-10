package Binary_Tree;

import java.util.HashMap;

public class BTS_Class {
    Binary_TreeNode<Integer> root;
    private boolean Hasdata_Healper(int data ,Binary_TreeNode<Integer> root){
     if(root == null) {
         return false;
     }if (root.data == data){
         return true;
        }
     else if(data>root.data){
         return Hasdata_Healper(data,root.right);
     }else {
         return Hasdata_Healper(data,root.left);
        }

    }
    public boolean Hasdata(int data){
        return Hasdata_Healper(data , root);
    }
}
