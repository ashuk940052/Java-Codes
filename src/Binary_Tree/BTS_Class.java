package Binary_Tree;
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
    private Binary_TreeNode<Integer> insertHelper(Binary_TreeNode<Integer> root , int data){
        if(root == null) {
            Binary_TreeNode<Integer> New_Node = new Binary_TreeNode<>(data);
            return New_Node;
        }if(root.data > data){
            root.left = insertHelper(root.left , data);
        }else{
            root.right = insertHelper(root.right , data );
        }
        return root;
    }
    private Binary_TreeNode<Integer> deletdata(Binary_TreeNode<Integer> root , int data){
        if(root == null){
            return  null;
        }
        if(data < root.data ){
            root.left = deletdata(root.left , data);
            return root;
        }else if(data> root.data){
            root.right = deletdata(root.right , data);
            return root;
        }else {
            if(root.left == null && root.right == null){
                return null;
            }else if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return root.left;
            }else{
                Binary_TreeNode<Integer> minimum = root.right;
                while (minimum.left != null){
                    minimum = minimum.left;
                }
                root.data = minimum.data;
               root.right = deletdata(root.right , minimum.data);
               return root;
            }
        }
    }
    private void printTree(Binary_TreeNode<Integer> root) {
        if(root == null){
            return ;
        }
        String TobePriented = root.data +":";
        if(root.left != null){
            TobePriented += "L:" + root.left.data+ " ,";
        }if(root.right != null){
            TobePriented += "R:" + root.right.data;
        }
        System.out.println(TobePriented);
        printTree(root.left);
        printTree(root.right);
    }
    public boolean Hasdata(int data){
        return Hasdata_Healper(data , root);
    }
    public void  insert(int data){
      root = insertHelper( root , data );
    }
    public void deletdata(int data){
        root = deletdata(root,data);
    }
    public void printTree(){
        printTree(root);
    }
    public static void main(String[] args) {
       BTS_Class BST = new BTS_Class();
       BST.insert(10);
        BST.insert(20);
        BST.insert(5);
        BST.insert(15);
        BST.insert(3);
        BST.insert(7);
        BST.printTree();
        System.out.println("____________AFTER DELETION _______________");
        BST.deletdata(10);
        BST.printTree();
        System.out.print("Search 5 in tree : "+BST.Hasdata(5));

    }
}
