import java.util.Stack;
public class copyStackInSameOrder{
    public static void main(String[] args){
        Stack<Integer> st_original = new Stack<>();
        st_original.push(1);
        st_original.push(2);
        st_original.push(3);
        st_original.push(4);
        st_original.push(5);
        st_original.push(6);
        System.out.println(st_original);

        Stack<Integer> st_reversed = new Stack<>();

        while(!st_original.isEmpty()){
            int element = st_original.pop();
            st_reversed.push(element);

            // we can also write 
            //st_reversed.push(st_original.pop());
        }

        Stack<Integer> st_copy = new Stack<>();

        while(!st_reversed.isEmpty()){
            int element = st_reversed.pop();
            st_copy.push(element);

            // we can also write 
            //st_reversed.push(st_original.pop());
        }
        System.out.println(st_copy);



    }
}