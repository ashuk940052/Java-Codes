package Binary_Tree;


public class Queue_LL<T> {

    private Node<T> front;
    private Node<T> rear;
    private int size;
    Queue_LL(){
        front=null;
        rear=null;
        size=0;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }
    void enqueue(T data){
        Node<T> newNode = new Node<>(data);
        if (rear==null){
            front=newNode;
            rear = newNode;
        }else {
            rear.next=newNode;
            rear=newNode;
        }
        size++;
    }
    T dequeue() throws queue_Empty_Exeption {
        if (size==0)
            throw new queue_Empty_Exeption();
        T temp = front.data;
        front=front.next;
        if (size==1){
            rear=null;
        }
        size--;
        return temp;
    }
    T front()throws queue_Empty_Exeption {
        if(size==0)
            throw new queue_Empty_Exeption();
        return front.data;
    }

}
