import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {

    public static void main(String[] args){

        Queue<Integer> queue = new LinkedList<>();

        //offer or add elements
        queue.offer(12);
        queue.offer(24);
        queue.offer(36);

        System.out.println(queue);

        //it removes elements from queue as it follows first in first out
        //real life example : at ticket counter , the person who is first in a line will get ticket first and also exit first
        System.out.println(queue.poll());

        //we can view peak
        System.out.println(queue.peek());
    }
}
