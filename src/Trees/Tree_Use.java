package Trees;
import java.util.*;

public class Tree_Use {
    public static Tree_Node<Integer> takeinput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter next node data ");
        int n = sc.nextInt();
        Tree_Node<Integer> root = new Tree_Node<>(n);
        System.out.print("Enter number of child for : "+ n+ " ");
        int child_count = sc.nextInt();
        for (int i=0; i<child_count ; i++){
            Tree_Node<Integer> child = takeinput();
            root.childern.add(child);
        }
        return root;
    }
    public static void print(Tree_Node<Integer> root){
        String s= root.Data +":";
        for (int i=0; i<root.childern.size();i++){
            s = s + root.childern.get(i).Data+",";
        }
        System.out.println(s);
        for (int i=0; i<root.childern.size();i++){
          print(root.childern.get(i));
        }

    }
    public static Tree_Node<Integer> takeInput_LevelWise(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter root data : ");
        int rootdata = sc.nextInt();
        Queue_LL<Tree_Node<Integer>> pending_Node = new Queue_LL<>();
        Tree_Node<Integer> root = new Tree_Node<>(rootdata);
        pending_Node.enqueue(root);
        while (!pending_Node.isEmpty()){
            try {
                Tree_Node<Integer> Front_Node = pending_Node.dequeue();
                System.out.print("Enter number of Children of " + Front_Node.Data +" : ");
                int Number_of_children = sc.nextInt();
                for (int i=0 ; i< Number_of_children ; i++){
                    System.out.print("Enter " + i +"th child of " + Front_Node.Data+" ");
                    int child = sc.nextInt();
                    Tree_Node<Integer> Child_Node = new Tree_Node<>(child);
                    Front_Node.childern.add(Child_Node);
                    pending_Node.enqueue(Child_Node);
                }
            } catch (queue_Empty_Exeption e) {
                // Shouldn't come here !!
                return null;
            }
        }
        return root;
    }
   public static  void print_LevelWise(Tree_Node<Integer> root){
       Queue_LL<Tree_Node<Integer>> Pending_node = new Queue_LL<>();
       if(root == null)
           return;
       Pending_node.enqueue(root);
       Pending_node.enqueue(null);
       while (!Pending_node.isEmpty()){
           try {
               Tree_Node<Integer> front_node = Pending_node.dequeue();
               if(front_node != null){
                   System.out.print(front_node.Data+" ");
                   for (int i=0; i < front_node.childern.size() ;i++ ){
                       Pending_node.enqueue(front_node.childern.get(i));
                   }
               }else{
                   System.out.println();
                   if(!Pending_node.isEmpty()){
                       Pending_node.enqueue(null);
                   }
               }

           } catch (queue_Empty_Exeption e) {
               //Idher to jindagi mai nahi aaunga !!
           }
       }

    }
    public static int count_Node(Tree_Node<Integer> root){
        int count =1;
        for (int i=0 ; i<root.childern.size();i++){
            count += count_Node(root.childern.get(i));
        }
        return count;
    }
    public static void Print_at_k(Tree_Node<Integer> root , int k){
        if(k<0){
            return;
        }
        if(k==0){
            System.out.print(root.Data+" ");
            return;
        }
        for (int i=0 ;i<root.childern.size();i++){
            Print_at_k(root.childern.get(i),k-1);
        }
    }
    public static int sum_Nodes(Tree_Node<Integer> root){
        int sum = root.Data;
        for (int i=0; i< root.childern.size();i++){
            sum += sum_Nodes(root.childern.get(i));
        }
        return sum;
    }
    public static int Largest_data(Tree_Node<Integer> root){
        if(root== null){
            return Integer.MIN_VALUE;
        }
        int ans = root.Data;
        for (int i=0 ;i< root.childern.size(); i++){
            int child_Largest = Largest_data(root.childern.get(i));
            if (child_Largest > ans){
                ans = child_Largest;
            }
        }
        return ans;
    }
    public static int Larger_Thant_X(Tree_Node<Integer> root , int x){
        if(root== null){
            return Integer.MIN_VALUE;
        }
        int ans = 0;
        if(root.Data > x)
        {
            ans++;
        }
        for (int i=0 ;i< root.childern.size(); i++){
             ans += Larger_Thant_X(root.childern.get(i),x);
        }
        return ans;
    }
    public static int hight_of_tree(Tree_Node<Integer> root){
        if(root==null){
            return 0;
        }
        int hight =1;
        for (int i=0;i<root.childern.size();i++){
            int child_hight = 1+ hight_of_tree(root.childern.get(i));
            if (child_hight>hight)
                hight=child_hight;
        }
        return hight;
    }
    public static void preorder(Tree_Node<Integer> root){
        if(root == null){
            return;
        }
        System.out.print(root.Data+" ");
        for (int i=0 ; i<root.childern.size();i++){
            preorder(root.childern.get(i));
        }
    }
    public static void postorder(Tree_Node<Integer> root){
        if(root == null){
            return;
        }
        for (int i=0 ; i<root.childern.size();i++){
            preorder(root.childern.get(i));
        }
        System.out.print(root.Data+" ");
    }
    public static void main(String[] args) {
//        Tree_Node<Integer> root = new Tree_Node<Integer>(4);
//        Tree_Node<Integer> node1 = new Tree_Node<Integer>(2);
//        Tree_Node<Integer> node2 = new Tree_Node<Integer>(3);
//        Tree_Node<Integer> node3 = new Tree_Node<Integer>(5);
//        Tree_Node<Integer> node4 = new Tree_Node<Integer>(6);
//
//        root.childern.add(node1);
//        root.childern.add(node2);
//        root.childern.add(node3);
//        node2.childern.add(node4);
//        System.out.println(root);
        Scanner sc = new Scanner(System.in);

        Tree_Node<Integer> root = takeInput_LevelWise();
        print_LevelWise(root);
        int Number_Of_Node = count_Node(root);
        System.out.println(Number_Of_Node);
        int sum_of_Tree = sum_Nodes(root);
        System.out.println(sum_of_Tree);
        int Largest = Largest_data(root);
        System.out.println(Largest);
        int Larger_than_x = Larger_Thant_X(root,30);
        System.out.println(Larger_than_x);
        System.out.println("----------------Hight-------------");
        int  hight_of_Tree = hight_of_tree(root);
        System.out.println(hight_of_Tree);
        System.out.println("_______________Print At K______________");
        int k = sc.nextInt();
        Print_at_k(root,k);
        System.out.println();
        System.out.println("---------Preorder Traversal------------");
        preorder(root);
        System.out.println();
        System.out.println("---------Postorder Traversal--------------------");
        postorder(root);
    }
}
