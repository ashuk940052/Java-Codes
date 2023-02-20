package Queue;

public class Queue_using_array {
    private int[] data;
    private int front;
    private int rear ;
    private int size ;
    public Queue_using_array(){
        data = new int[10];
        front =-1;
        rear=-1;
        size=0;
    }
    public Queue_using_array(int capacity){
        data = new int[capacity];
        front =-1;
        rear=-1;
        size=0;
    }
    int size(){
        return size;
    }
    boolean isEmpty(){
        return size==0;
    }
    int front() throws queueEmptyExeption{
        if(size==0){
            throw new queueEmptyExeption();
        }
        return data[front];
    }
    void enqueue(int element) throws queueFullExeption{
        if (size==data.length){
          throw new queueFullExeption();
        }
          if(size==0){
             front=0;
          }
          size++;
          rear = (rear+1) % data.length;
          data[rear] =element;
    }
    int dequeue()throws queueEmptyExeption{
        if (size==0){
            throw new queueEmptyExeption();
        }
        int temp = data[front];
        front=(front+1) % data.length;
        size--;
        if (size==0){
            front =-1;
            rear =-1;
        }
           return temp;
    }
}
