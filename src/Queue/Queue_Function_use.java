package Queue;

public class Queue_Function_use {
    public static void main(String[] args) throws queueFullExeption, queueEmptyExeption {
        Queue_using_array queue = new Queue_using_array(11);
        for (int i=1 ; i<11 ;i++){
            try {
                queue.enqueue(i);
            } catch (queueFullExeption ignored) {
            }

        }
        while (!queue.isEmpty()){
            try {
                System.out.println(queue.dequeue());
            }catch (queueEmptyExeption ignored){

            }
        }

    }
}
