package Link_List;

import java.util.Scanner;

public class Insert_Recursively {
    public static Node<Integer> takeInput()
    {
        Node<Integer> head = null , tail=null;
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        while (data != -1){
            Node<Integer> newNode = new Node<>(data);
            if(head == null){
                head = newNode;
            }else {
                tail.next = newNode;
            }
            tail =newNode;
            data = sc.nextInt();
        }
        return head;
    }
    public static Node<Integer> Insert_recurcive(Node<Integer> head , int pos , int ele){
        if (pos == 0){
            Node<Integer> NewNode = new Node<>(ele);
            NewNode.next = head;
            return NewNode;
        }
        if (head == null){
            return head;
        }
        head.next = Insert_recurcive(head.next, pos-1 , ele);
        return head;
    }
    public static void printR(Node<Integer> head){
        if (head == null){
            return;
        }
        System.out.print(head.data+" ");
        printR(head.next);
    }

    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        Insert_recurcive(head, 2 , 10);
        printR(head);



    }
}
