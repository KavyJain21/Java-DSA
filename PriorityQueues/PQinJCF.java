package PriorityQueues;
import java.util.*;
public class PQinJCF {
    public static void main(String[] args) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(3);
        pq.add(6);
        pq.add(2);
        pq.add(16);

        while (!pq.isEmpty()) {
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}
