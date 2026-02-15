import java.util.PriorityQueue;
public class heapsBasic{
    public static void main(String[] args){
        PriorityQueue pq = new PriorityQueue<>(); // this is min heap
        
        pq.add(5);
        pq.add(8);
        pq.add(4);
        System.out.println(pq);
        pq.remove();
        System.out.println(pq);


    }
}