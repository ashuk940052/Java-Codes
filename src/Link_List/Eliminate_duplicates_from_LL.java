package Link_List;

import java.util.Objects;
import java.util.Scanner;

public class Eliminate_duplicates_from_LL {
    public static Node<Integer> eliminate_duplicate(Node<Integer> head){
        Node<Integer> temp = head , t2 = head.next;

        while (t2.next != null){
            if (Objects.equals(temp.data, t2.data)) {
                t2 = t2.next;
            }
            else {
                temp.next = t2;
                temp =t2;
            }
        }
        temp.next=null;
       return head;
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
        Node<Integer> Head = takeInput();
        Node<Integer> prashant = eliminate_duplicate(Head);
        print(prashant);
    }
}
