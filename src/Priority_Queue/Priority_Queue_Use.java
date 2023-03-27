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
    private static int removeMINVertual_Heap(int arr[] , int Heapsize){
      int temp = arr[0];
      arr[0]= arr[Heapsize-1];
      Heapsize--;
      int index = 0;
      int leftChildIndex = 2 * index + 1;
      int rightChildIndex = 2 * index +2;
      while (leftChildIndex<Heapsize){
          int minIndex = index;
          if (arr[leftChildIndex] < arr[minIndex]){
              minIndex = leftChildIndex;
          }
          if(rightChildIndex < Heapsize && arr[rightChildIndex] < arr[minIndex]){
              minIndex = rightChildIndex;
          }
          if(minIndex != index){
             int temp1 = arr[index];
             arr[index] = arr [ minIndex];
             arr[minIndex] = temp1;
              index = minIndex;
              leftChildIndex = 2 * index + 1;
              rightChildIndex = 2 * index +2;

          }else {
              break;
          }
      }
      return temp;

    }
    public static void main(String[] args) {
        int[] arr = {5,1,9,2,0,6};
        for (int i=0 ; i<arr.length ;i++){
            insertVertual_Heap(arr,i);
        }
        for (int i=0 ; i<arr.length ;i++){
            arr[arr.length - 1 - i ] = removeMINVertual_Heap(arr, arr.length-i);
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
