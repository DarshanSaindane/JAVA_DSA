import java.util.Stack;
public class implementationOfStack{
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();

        st.push(11);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st);
        System.out.println(st.size());

        //To access the first element insert in the stack
        while(st.size()>1){
            st.pop();
        }
        //size is now become one
        System.out.println(st.peek());

    }
}