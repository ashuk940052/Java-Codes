package Link_List;

import java.util.Scanner;

public class PrintR {
    public static void printR(Node<Integer> head){
        if (head == null){
            return;
        }

        printR(head.next);
        System.out.print(head.data+" ");
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
    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        printR(head);

    }
}
