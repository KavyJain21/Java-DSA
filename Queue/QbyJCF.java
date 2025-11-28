package Queue;
import java.util.*;
public class QbyJCF {
    public static void main(String[] args) {
        Queue<Integer>q= new LinkedList<>(); // array deque can also be used
          q.add(1); q.add(2);q.add(3);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
           q.remove();
        }
    }
}
