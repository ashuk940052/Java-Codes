package Link_List;

import java.util.Scanner;

public class Print_Reverse_LinkedList {
    public static Node<Integer> print_reverse(Node<Integer> head){
      if (head == null)
          return head;
      Node<Integer> smalloutput = print_reverse(head.next);
        System.out.print(head.data+" ");
        return smalloutput;
    }
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
    public static void print(Node<Integer> head ){
        while (head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Node<Integer> head = takeInput();
            print_reverse(head);
        print(head);
    }
}
