import java.util.ArrayList;
import java.util.Stack;

public class StackMain {
    public static class stack{
        static ArrayList<Integer> list = new ArrayList<Integer>();
        public boolean isEmpty(){
             return list.size()==0;
        }
        public void push(int data){
            list.add(data);
        }
        public int pop(){
            if (list.isEmpty()){
               return -1;
            }
            int top = list.get(list.size()-1); //time complexity of get is O(1)
            list.remove(list.size()-1);
            return top;
        }
        public int peek(){
            if (list.isEmpty()){
                return -1;
            }
            return list.get(list.size()-1); //time complexity of get is O(1)

        }

    }

    public static void main(String[] args) {
        stack obj = new stack();
        System.out.println(obj.peek());
    }
}
