//Do this in linked list
import java.util.Stack;
public class palindrom{
    public static void main(String[] args){
        int[] arr = {1,2,3,2,1};
        Stack<Integer> st = new Stack<>();

        for(int i=0;i<arr.length;i++){
            st.push(arr[i]);
        }
        int i =0;
        while(!st.isEmpty() && st.peek()==arr[i]){
            st.pop();
            i++;
        }
        if(st.isEmpty()){
            System.out.println("palindrom");
        }
        else{
            System.out.println("not a palindrom");
        }

    }
}

