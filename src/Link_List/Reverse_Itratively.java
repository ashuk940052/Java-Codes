package Link_List;
import java.util.Scanner;

public class Reverse_Itratively {
    public static Node<Integer> takeInput(){
        Node<Integer> head = null , tail =null;
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        while (data != -1){
            Node<Integer> newNode = new Node<>(data);
            if(head==null) {
                head = newNode;
            }else {
                tail.next = newNode;
            }
            tail= newNode;
            data = sc.nextInt();
        }
        return head;
    }
    public static Node<Integer> print(Node<Integer> head){
        if(head == null){
            return head;
        }
        System.out.print(head.data +" ");
        Node<Integer> smallans = print(head.next);
        return smallans;
    }
    public static Node<Integer> reverse_Itrative(Node<Integer> head){
        Node<Integer> prev=null , curr=head , temp ;
        while (curr != null){
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        head = reverse_Itrative(head);
        print(head);

    }
}
