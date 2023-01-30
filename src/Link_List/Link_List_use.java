package Link_List;

import java.util.Scanner;

public class Link_List_use {
    public static Node<Integer> takeInput(){
        Node<Integer> head = null;
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        while (data != -1){
            Node<Integer> newNode = new Node<>(data);
            if(head == null){
                head = newNode;
            }else {
                Node<Integer> temp = head;
                while (temp.next != null){
                    temp = temp.next;
                }
                temp.next=newNode;
            }
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
        Node<Integer> node1 = new Node<>(10);
        System.out.println(node1.data);

        Node<Integer> node2 = new Node<>(20);
        node1.next=node2;
        System.out.println(node1.next);
        System.out.println(node2.data);
        System.out.println(node2.next);
        Node<Integer> Prashant = takeInput();
        print(Prashant);

    }
}
