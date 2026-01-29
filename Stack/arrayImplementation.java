import java.util.Stack;
public class arrayImplementation{
    public static class Stack{
        private int[] arr = new int[5];
        private int idx = 0;

        void push(int x){
            if(isFull()){
                System.out.println("Stack is full");
                return;
            }
            arr[idx]=x;
             idx++;
        }

        int peek(){
            if(idx == 0){
                System.out.println("stack is Empty");
                return -1;
            }
            return arr[idx-1];
        }

        void display(){
            for(int i=0;i<=idx-1;i++){
                System.out.println(arr[i]);
            }
        }

        int size(){
            return idx;
        }

        boolean isEmpty(){
            if(idx==0){
                return true;
            }
            else{
                return false;
            }
        }

        boolean isFull(){
            if(arr.length == idx){
                return true;
            }
            else{
                return false;
            }
        }

        int pop(){
            if(isEmpty()){
                System.out.println("stack is empty");
                return 0;
            }
            int top = arr[idx-1];
            arr[idx-1] = 0;
            idx--;
            return top;
        }
    }
    public static void main(String[] args){
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(45);
        System.out.println(st.peek());
        System.out.println(st.size());
        System.out.println(st.pop());
        
        st.display();




    }
}