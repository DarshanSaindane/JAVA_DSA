import java.util.*;
public class reverseQueue{
    static Queue<Integer> que;
    static void print(){
        System.out.print(que);
    }
    static void reverse(){
        Stack<Integer> st = new Stack<>();
        while(!que.isEmpty()){
            st.push(que.remove());
        }
        while(!st.isEmpty()){
            que.add(st.pop());
        }
    }
    public static void main(String[] args){
        que = new LinkedList<>();
        que.add(10);
        que.add(20);
        que.add(30);
        que.add(40);
        que.add(50);
        que.add(60);
        que.add(70);
        print();
        System.out.println("Rever the queue");
        reverse();
        print();
    }

}