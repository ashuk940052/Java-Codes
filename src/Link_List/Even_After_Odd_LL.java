package Link_List;
import java.util.Scanner;

public class Even_After_Odd_LL {
    public static Node<Integer> print(Node<Integer> head){
        if(head == null){
            return head;
        }
        System.out.print(head.data+" ");
        Node<Integer> smallans = print(head.next);
        return smallans;
    }
    public static Node<Integer> takeinput(){
        Node<Integer> head = null , tail = null;
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        while (data != -1){
            Node<Integer> newNode = new Node<>(data);
            if (head ==null){
                head = newNode;
            }else {
                tail.next = newNode;
            }
            tail = newNode;
            data = sc.nextInt();
        }
        return head;
    }
    public static Node<Integer> even_After_Odd(Node<Integer> head){
        Node<Integer> oddHead=null , oddTail =null , evenHead =null , evenTail =null;
        if (head == null || head.next == null){
            return head;
        }
        while(head != null){
            if (head.data %2 == 0){
                if(evenTail == null){
                    evenHead = head;
                    evenTail = head;
                }else {
                  evenTail.next =head;
                  evenTail = evenTail.next;
                }

            }
            else {
                if(oddTail == null){
                    oddHead =head;
                    oddTail = head;
                }else {
                    oddTail.next= head;
                    oddTail = oddTail.next;
                }

            }
            head = head.next;
        }
        if (oddHead == null){
            return evenHead;
        }else {
            oddTail.next =evenHead;
        }
        if(evenTail != null){
            evenTail.next =null;
        }
        return oddHead;
    }
    public static void main(String[] args) {
     Node<Integer> head = takeinput();
     head = even_After_Odd(head);
     print(head);
    }
}
