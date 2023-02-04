package Link_List;

import java.util.Scanner;

public class MidPoint_of_LinkList {
    public static Node<Integer> TakeInput(){
        Node<Integer> head=null, tail = null;
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        while (data !=-1){
            Node<Integer> NewNode = new Node<>(data);
            if(head == null){
                head = NewNode;
            }else {
                tail.next = NewNode;
            }
            tail = NewNode;
            data = sc.nextInt();
        }
        return head;
    }
    public static Node<Integer> midpoint(Node<Integer> head){
        Node<Integer> slow = head, fast = head ;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        Node<Integer> head = TakeInput();
        Node<Integer> mid = midpoint(head);
        System.out.print(mid.data);

    }
}
