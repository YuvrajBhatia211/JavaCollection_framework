import java.util.Comparator;
import java.util.PriorityQueue;

public class Learnpriorityqueue {

    public static void main(String[] args){
        PriorityQueue<Integer>  pq = new PriorityQueue<>(Comparator.reverseOrder() );

        // adding elements
        pq.offer(34);
        pq.offer(12);
        pq.offer(5);

        System.out.println(pq);

        //you will notice that order of printing elements is changed
        // because under the hook a min heap is implementing
        // thats why minimum element will be on first position

        //lets remove first element
        System.out.println(pq.poll());
        System.out.println(pq);

        //peek function will show the element which is next in line to be removed easily
        System.out.println(pq.peek());
    }
}
