import java.util.*;
public class evenRemove{
    static Queue<Integer> que;
    static Queue<Integer> newQue;

    static void remove(){
        newQue = new LinkedList<>();
        while(!que.isEmpty()){
            que.remove();
            if(!que.isEmpty()){
                newQue.add(que.remove());
            }
        }
        que = newQue;


    }
    public static void main(String[] args){
        que = new LinkedList<>();
        que.add(1);
        que.add(2);
        que.add(3);
        que.add(4);
        que.add(5);
        que.add(6);
        que.add(7);
        System.out.println(que);
        remove();
        System.out.println(que);

    }
}