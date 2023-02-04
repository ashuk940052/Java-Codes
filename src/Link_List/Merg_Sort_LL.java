package Link_List;

import java.util.Scanner;

public class Merg_Sort_LL {
    public static Node<Integer> midpoint(Node<Integer> head){
        Node<Integer> slow =head, fast = head ;
        if (head == null){
            return head;
        }
        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return  slow;
    }
    public static Node<Integer> Merge_Sort_LL(Node<Integer> head1 , Node<Integer> head2){
        Node<Integer> t1 = head1, t2=head2 , head = null  , tail = null ;
        if(head1 == null){
            return head2;
        }
        if(head2 == null){
            return head1;
        }
        if(t1.data <= t2.data){
            head = t1;
            tail =t1 ;
            t1 = t1.next;
        }else{
            head = t2;
            tail =t2;
            t2 = t2.next;
        }
        while (t1 != null && t2 != null){
            if(t1.data <= t2.data){
                tail.next =t1 ;
                tail = t1;
                t1 =t1.next;
            }else {
                tail.next = t2;
                tail = t2;
                t2 = t2.next;
            }
        }
        if (t1 != null){
            tail.next =t1;
        }
        if(t2 != null) {
            tail.next =t2;
        }
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
    public static Node<Integer> merg_sort(Node<Integer> head){
        if (head == null){
            return  head;
        }
        if (head.next == null){
            return head;
        }
        Node<Integer> MidNode = midpoint(head);
        Node<Integer> H2 = MidNode.next;
        MidNode.next = null;
        Node<Integer> Part1 = merg_sort(head);
        Node<Integer> Part2 = merg_sort(H2);
        Node<Integer> MergList = Merge_Sort_LL(Part1,Part2);
        return  MergList;
    }
    public static void print_ll(Node<Integer> head){

        while ( head != null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        Node<Integer>Prashant = merg_sort(head);
        print_ll(Prashant);

    }
}
