package Queue;

public class Queue_Function_use {
    public static void main(String[] args) throws queueEmptyExeption {
        Queue_Using_LL<Integer> queue = new Queue_Using_LL<>();
       for (int i =1; i<10 ;i++){
           queue.enqueue(i);
       }
      while (! queue.isEmpty()){
          System.out.println(queue.dequeue()+ " ");
      }
    }
}
