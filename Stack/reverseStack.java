import java.util.Stack;
public class reverseStack{
    //reverse the Stack by recursively
    public static void displayReverse(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }
        int top = st.pop();
        System.out.println(top); // For reverse order
        displayReverse(st);
        //System.out.println(top);  // for same order
        st.push(top);
    }
    public static void main(String[] args){
        Stack<Integer> st_original = new Stack<>();
        st_original.push(1);
        st_original.push(2);
        st_original.push(3);
        st_original.push(4);
        st_original.push(5);
        // System.out.println(st_original);
             
             //**By Nornal method**
        // Stack<Integer> st_reversed = new Stack<>();

        // while(!st_original.isEmpty()){
        //     int element = st_original.pop();
        //     st_reversed.push(element);

        //     // we can also write 
        //     //st_reversed.push(st_original.pop());
        // }
        // System.out.println(st_reversed);

        displayReverse(st_original);

    }
}