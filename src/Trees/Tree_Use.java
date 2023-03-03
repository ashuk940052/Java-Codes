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
                   System.out.print(front_node.Data);
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
    public static int sum_Nodes(Tree_Node<Integer> root){
        int sum = root.Data;
        for (int i=0; i< root.childern.size();i++){
            sum += sum_Nodes(root.childern.get(i));
        }
        return sum;
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

        Tree_Node<Integer> root = takeInput_LevelWise();
        print_LevelWise(root);
        int Number_Of_Node = count_Node(root);
        System.out.println(Number_Of_Node);
        int sum_of_Tree = sum_Nodes(root);
        System.out.println(sum_of_Tree);

    }
}
