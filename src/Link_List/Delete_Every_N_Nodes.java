package Link_List;

import java.util.Scanner;

public class Delete_Every_N_Nodes {
    public static Node<Integer> takeinput(){
        Node<Integer> head = null , tail =null;
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        while ( data != -1){
            Node<Integer> newNode = new Node<>(data);
            if(head == null){
                head = newNode;
            }else {
                tail.next= newNode;
            }
            tail =newNode;
            data = sc.nextInt();
        }
        return head;
    }
    public static Node<Integer> print(Node<Integer> head){
        if(head == null){
            return head;
        }
        System.out.print(head.data+" ");
        Node<Integer> smallans = print(head.next);
        return smallans;
    }
    public static Node<Integer> Delete_Every_n_Nodes(Node<Integer> head , int M, int N){
        if (M==0)
        {
            return null;
        }
        if (N==0)
        {
            return head;
        }

        Node<Integer> node=head,delNode=null;
        while(node!=null)
        {
            for (int i=0;i<M-1 && node!=null;i++)
            {

                node=node.next;
            }

            if (node==null)
            {
                break;
            }

            delNode=node.next;
            for (int i=0;i<N && delNode!=null;i++)
            {

                delNode=delNode.next;
            }
            node.next=delNode;
            node=delNode;
        }

        return head;
    }
    public static void main(String[] args) {
        Node<Integer> head =takeinput();
        head= Delete_Every_n_Nodes(head,2,2);
        print(head);

    }
}
