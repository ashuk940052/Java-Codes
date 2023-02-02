package Link_List;

import java.util.Objects;
import java.util.Scanner;

public class Palindrome_LinkedList {
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
                tail.next = newNode;
                tail = newNode;
            }
            data = sc.nextInt();
        }
        return head;
    }
//    public static void print(Node<Integer> head ){
//        while (head != null){
//            System.out.print(head.data+" ");
//            head = head.next;
//        }
//    }
public static Node<Integer> print_reverse(Node<Integer> head){
    if (head == null)
        return head;
    Node<Integer> smalloutput = print_reverse(head.next);
    //System.out.print(head.data+" ");
    return smalloutput;
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
public static boolean isPalindrome(Node<Integer> head){
     if (head == null){
         return true;
     }
     Node<Integer>  tail = head , newHead ;
     int LL_length = length(head);
     if (LL_length%2 == 0) {
         int i = 0;
         while (i < LL_length / 2 - 1) {
             tail = tail.next;
             i++;
         }
         newHead = tail.next;
     }else {
         int i = 0;
         while (i < (LL_length+1 )/ 2) {
             tail = tail.next;
             i++;
         }
         newHead = tail.next;

     }
     print_reverse(newHead);
     boolean ans = true;
     while (head != null && newHead !=null){
         if (!Objects.equals(head.data, newHead.data)){
             return false;
             }
         else {
             head = head.next;
             newHead = newHead.next;
         }
     }
return  ans;
}


    public static void main(String[] args) {
      Node<Integer> head = takeInput();
     boolean ans = isPalindrome(head);
        System.out.print(ans);
    }
}
