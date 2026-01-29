import java.util.*;
public class implementation{
    public static void main(String[] args){
        Queue<Integer> que = new LinkedList<>();
        //adding and removing element in queue

        que.add(1);
        que.add(2);
        que.add(3);
        que.add(4);
        System.out.println(que);
        que.remove(); // or que.poll();

        System.out.println(que);
        //peek of the queue
        System.out.println(que.peek());
        //size of the queue
        System.out.println(que.size());
        //check that queue is empty or not
        System.out.println(que.isEmpty());
    }
}