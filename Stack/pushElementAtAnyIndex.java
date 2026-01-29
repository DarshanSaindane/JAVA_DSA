import java.util.Stack;
public class pushElementAtAnyIndex{
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);

        Stack<Integer> temp = new Stack<>();
        while(st.size()>=3){
            int element = st.pop();
            temp.push(element);
        }
        st.push(55);
        while(!temp.isEmpty()){
            int ele = temp.pop();
            st.push(ele);
        }
        System.out.println(st);


        

    }
}