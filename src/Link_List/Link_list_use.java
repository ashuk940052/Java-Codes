package Link_List;

public class Link_list_use {
    public static void print(Node<Integer> head){
        Node<Integer> temp = head ;
        while (head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.println();
        head = temp;
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }

    }
    public static void main(String[] args) {
//        Node<Integer> node1 = new Node<Integer>(10);
//        System.out.print(node1.data+" ");
//        Node<Integer> node2 = new Node<Integer>(20);
//        node1.next = node2;
//        System.out.print(node1.next+" ");
//        System.out.print(node2.data+" ");
//
//        Node<Integer> node3 = new Node<Integer>(30);
//        node2.next=node3;
//        System.out.print(node2.next+" ");
//        System.out.print(node3.data+" ");
//        System.out.print(node3.next);


        Node<Integer> node1 = new Node<>(10);
        Node<Integer> node2 = new Node<>(20);
        Node<Integer> node3 = new Node<>(30);
        node1.next=node2;
        node2.next = node3;
        Node<Integer> head = node1;
        print(head);


    }
}
