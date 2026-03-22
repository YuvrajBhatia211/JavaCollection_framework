import java.util.ArrayDeque;

public class LearnArrayDeque {

    public static void main(String[] args){

        ArrayDeque<Integer> adq = new ArrayDeque<>();

        //add in deque
        adq.offer(23);

        //add element in the head
        adq.offerFirst(34);

        //add element on the last position
        adq.offerLast(45);

        System.out.println(adq);

    }
}
