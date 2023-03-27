package Priority_Queue;

public class Priority_Queue_Use  {
    public static void main(String[] args) throws PriorityQueueException {
        Priority_queue obj = new Priority_queue();
        int[] arr = {5,1,9,2,0};
        for (int i=0 ; i<arr.length ;i++){
            obj.insert(arr[i]);
        }
        while (!obj.isEmpty()){
            System.out.print(obj.removeInt() + "");
        }
        System.out.println();
    }
}
