package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Stack_Using_2_Queue<T> {
    Queue<Integer> q1;
    Queue<Integer> q2;
    int size;


    public Stack_Using_2_Queue() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
        size = 0;
    }



    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(int element) {
        q1.add(element);
        size++;
    }

    public int pop() {
        if (isEmpty())
            return -1;
        while (q1.size() > 1) {
            q2.add(q1.remove());
        }
        int top = q1.remove();
        size--;
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        return top;
    }

    public int top() {
        if (isEmpty())
            return -1;
        while (q1.size() > 1) {
            q2.add(q1.remove());
        }
        int top = q1.remove();
        q2.add(top);
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        return top;
    }
}
