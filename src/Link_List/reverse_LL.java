package Link_List;

import java.util.Scanner;

class DoubleNode{
    Node<Integer> head;
    Node<Integer> tail;
}
public class reverse_LL {
    public static Node<Integer> takeInput(){
        Node<Integer> head = null , tail = null ;
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        while (data != -1){
            Node<Integer> newNode = new Node<>(data);
            if(head== null){
                head = newNode;
            }else {
                tail.next = newNode;
            }
            tail = newNode;
            data = sc.nextInt();
        }
        return head;
    }
    public static Node<Integer> print_LL(Node<Integer> head){
        if (head == null){
            return head;
        }
        System.out.print(head.data+ " ");
        Node<Integer> smallerans = print_LL(head.next);
        return smallerans;
    }
    public static Node<Integer> Reverse_LL(Node<Integer> head){
        if(head == null || head.next == null ){
            return head ;
        }
        Node<Integer> smallans = Reverse_LL(head.next);
        Node<Integer> node = smallans;
        while (node.next != null){
            node=node.next;
        }
        node.next =head;
        head.next = null;
        return smallans;
    }
    public static Node<Integer> Reverse_LL3(Node<Integer> head){
        if(head == null || head.next == null){
            return head ;
        }
        Node<Integer> reversed_Tail = head.next;
        Node<Integer> smallerans = Reverse_LL3(head.next);
        reversed_Tail.next = head;
        head.next =null;
        return smallerans;
    }
    public static DoubleNode Reverse_LL_Better(Node<Integer> head){
        if(head == null || head.next == null){
            DoubleNode ans = new DoubleNode();
            ans.head = head;
            ans.tail = head ;
            return ans;
        }
        DoubleNode smallans = Reverse_LL_Better(head.next);
        smallans.tail.next =head;
        head.next= null;

        DoubleNode ans = new DoubleNode();
        ans.head = smallans.head;
        ans.tail =head;
        return ans;
    }

    public static void main(String[] args) {
       Node<Integer> head = takeInput();
       head = Reverse_LL3(head);
       DoubleNode ans = new DoubleNode();
       ans = Reverse_LL_Better(head);
        print_LL(head);
    }
}
