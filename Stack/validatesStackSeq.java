import java.util.Stack;
public class validatesStackSeq{
    public static boolean Seq(int[] pop,int[] push){
        Stack<Integer> st = new Stack<>();
        int j = 0; //pointer for pop array
        for(int val:push){
            st.push(val);

            while(!st.isEmpty() && st.peek() == pop[j]){
                st.pop();
                j++;
            }
        }
        return st.isEmpty();

    }
    public static void main(String[] args){
        int[] poped = {1,2,3,4};
        int[] pushed = {4,3,2,1};
        System.out.println(Seq(poped,pushed));
    }
}