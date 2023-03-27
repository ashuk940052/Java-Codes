package Priority_Queue;

public class Priority_Queue_Use  {
    public static void insertVertual_Heap(int[] arr, int i){
           int childIndex = i;
           int parentIndex = (childIndex-1) / 2 ;
           while (childIndex>0){
               if(arr[childIndex] < arr[parentIndex]){
                   int temp = arr[childIndex];
                   arr[childIndex] = arr[parentIndex];
                   arr[parentIndex] = temp;
                   childIndex = parentIndex;
                   parentIndex = (childIndex-1) / 2 ;

               }else {
                   return;
               }
           }
    }
    public static void main(String[] args) throws PriorityQueueException {
        int[] arr = {5,1,9,2,0,6};
        for (int i=0 ; i<arr.length ;i++){
            insertVertual_Heap(arr,i);
        }
        for (int i=0 ; i<arr.length ;i++){
            System.out.print(arr[i]+" ");
        }

        //        Priority_queue obj = new Priority_queue();
//        int[] arr = {5,1,9,2,0};
//        for (int i=0 ; i<arr.length ;i++){
//            obj.insert(arr[i]);
//        }
//        while (!obj.isEmpty()){
//            System.out.print(obj.removeInt() + "");
//        }
//        System.out.println();
    }
}
