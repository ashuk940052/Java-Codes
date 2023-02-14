package Stack;

public class Stack_Use_class {
    public static void main(String[] args) throws StackFullExeption {
        Stack_Using_array Stack = new Stack_Using_array(3);
        for(int i =1 ; i<=10 ;i++){
            Stack.push(i);
        }
        while (!Stack.isEmpty()){
            try{
                System.out.println(Stack.pop());
            }catch (StackemptyException e){
              //never reach here
            }
        }

    }


}
