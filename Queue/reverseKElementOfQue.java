import java.util.*;
public class reverseKElementOfQue{
    public Queue<Integer> reverse(int k,Queue<Integer> que){
        if(que.isEmpty() || k>que.size() || k<=0){
            System.out.println("Invalid k");
            return que;
        }
        Stack<Integer> st = new Stack<>();

        //remove the element from queue upto k and add to stack
        for(int i=0; i<k;i++){
            st.push(que.poll());
        }
        while(!st.isEmpty()){
            que.add(st.pop());
        }
        for(int i=0;i<que.size()-k;i++){
            que.add(que.poll());
        }
        return que;
    }
    public static void main(String[] args){
     
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        
        reverseKElementOfQue obj = new reverseKElementOfQue();
        Queue<Integer> ans = obj.reverse(3, q);

        System.out.println("Queue after reversing first 3 elements: " + ans);

    }
}