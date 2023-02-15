package Stack;

public class Stack_Using_LL<T> {
    private Node<T> head;
    private int size;

      Stack_Using_LL(){
        head = null;
        size = 0;
    }
    int size(){
        return size;
    }
    T top() throws StackemptyException{
        if(head == null){
          throw new StackemptyException();
        }
        return head.data;
    }
    boolean isEmpty(){
        return (size == 0);
    }
    void push(T ele){
        Node<T> newNode =new Node<T>(ele);
        newNode.next = head;
        head = newNode;
        size=size+1;

    }
    T pop()throws StackemptyException{
          if (head==null){
              throw new StackemptyException();
          }
          T temp = head.data;
          head = head.next;
          size = size-1;
          return temp;
    }
}
