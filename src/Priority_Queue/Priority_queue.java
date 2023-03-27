package Priority_Queue;

import java.util.ArrayList;

public class Priority_queue {
    private ArrayList<Integer> heap;
    public Priority_queue(){
        heap = new ArrayList<>();
    }
    boolean isEmpty(){
        return heap.size()==0;
    }
    int size(){
        return heap.size();
    }
    int getMin() throws PriorityQueueException{
        if(isEmpty()){
          throw new PriorityQueueException();
        }
        return heap.get(0);
    }
    void insert(int element){
        heap.add(element);
        int chiledIndex = heap.size() -1;
        int parentIndex = (chiledIndex -1) / 2;
        while (chiledIndex > 0){
            if(heap.get(chiledIndex) < heap.get(parentIndex) ){
                int temp = heap.get(chiledIndex);
                heap.set(chiledIndex , heap.get(parentIndex));
                heap.set(parentIndex , temp );
                chiledIndex = parentIndex;
                parentIndex = (chiledIndex-1 )/2;
            }else {
                return;
            }
        }
    }
    int removeInt() throws PriorityQueueException{
        if(isEmpty()){
            throw new PriorityQueueException();
        }
        int temp = heap.get(0);
        heap.set(0,heap.get(heap.size()-1));
        heap.remove(heap.size()-1);
        int index = 0;
        int minIndex = index;
        int leftChildIndex = 1;
        int rightChildIndex = 2;
        while (leftChildIndex < heap.size()) {
            if (heap.get(leftChildIndex) < heap.get(minIndex)) {
                minIndex = leftChildIndex;
            }
            if (rightChildIndex<heap.size() && heap.get(rightChildIndex) < heap.get(minIndex)) {
                minIndex = rightChildIndex;
            }
            if(minIndex ==index){
                break;
            }else {
                int temp1 = heap.get(index);
                heap.set(index, heap.get(minIndex));
                heap.set(minIndex, temp1);
                index = minIndex;
                leftChildIndex = 2 * index +1;
                rightChildIndex = 2* index +2;
            }
        }
        return temp;
    }
}
