import java.util.PriorityQueue;
import java.util.Collections;
public class kthLargestElement{
    public static void main(String[] args){
        int[] arr = {5,2,6,7,9,4,1,22};
        int k = 3;
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // this is max heap
        for(int ele : arr){
            pq.add(ele);
            if(pq.size()>k) pq.remove();

        }
        System.out.println(pq.peek());
    }
}
      