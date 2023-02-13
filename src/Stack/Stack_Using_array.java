package Stack;

public class Stack_Using_array {
    private int[] data;
    private int top;
    public Stack_Using_array(){
    data = new int[10];
    top =-1;
    }
    public Stack_Using_array(int capacity){
        data = new int[capacity];
        top =-1;
    }
    public boolean isEmpty(){
        return (top == -1);
    }
    public int size(){
        return top+1;
    }
    public int top() throws StackemptyException{
        if (size()==0){
           StackemptyException e = new StackemptyException();
           throw e;
        }
        return data[top];
    }
    public void push(int ele) throws StackFullExeption{
        if (size()==data.length){
            StackFullExeption e = new StackFullExeption();
            throw e;
        }
        top++;
        data[top] = ele;

    }
    public int pop() throws StackemptyException {
        if (size() == 0){
            StackemptyException e = new StackemptyException();
            throw e;
        }
        int temp = data[top];
        top--;
        return temp;
    }
}
