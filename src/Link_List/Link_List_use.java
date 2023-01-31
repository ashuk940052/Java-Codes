package Link_List;

import java.util.Scanner;

public class Link_List_use {
    public static Node<Integer> deleteNode(int pos,Node<Integer> head){
        Node<Integer> temp = head;
        if(head==null){
            return null;
        }
        if(pos == 0){
            return head.next;
        }
        int i =0;
        while (i<pos-1 && temp != null){
            temp = temp.next;
            i++;
        }
        if(temp == null){
            return head;
        }
        if (temp != null){
        temp.next =temp.next.next;}
        return head;
    }
    public static Node<Integer> InsertNode(int pos , int data , Node<Integer> head){
        Node<Integer> newNode = new Node<>(data);
        if(pos==0){
            newNode.next = head;
            return newNode;
        }
        int i = 0;
        Node<Integer> temp = head ;
        while(i < pos-1){
            temp = temp.next;
            i++;
        }
        newNode.next= temp.next;
        temp.next=newNode;
       return head;
    }
    public static Node<Integer> takeInput(){
        Node<Integer> head = null , tail=null;
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        while (data != -1){
            Node<Integer> newNode = new Node<>(data);
            if(head == null){
                head = newNode;
                tail =newNode;
            }else {
//                Node<Integer> temp = head;
//                while (temp.next != null){
//                    temp = temp.next;
//                }
//                temp.next=newNode;
                tail.next = newNode;
                tail = newNode;
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
    public static int length(Node<Integer> head){
        Node<Integer> temp = head ;
        int i=0;
        while (temp != null){
            i++;
            temp = temp.next;
        }
        return i;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node<Integer> Prashant = takeInput();

//        int pos = sc.nextInt();
//        System.out.print("Enter the data : ");
//        int data = sc.nextInt();
//        Prashant = InsertNode(pos,data,Prashant);


        print(Prashant);
        System.out.print("enter the position at which you want to delete Node : ");
        int deletePos = sc.nextInt();
        Prashant=deleteNode(deletePos,Prashant);
        System.out.println();
        print(Prashant);
        int length_of_ll = length(Prashant);
        System.out.println(length_of_ll);


    }
}
