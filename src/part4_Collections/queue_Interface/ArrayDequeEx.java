package part4_Collections.queue_Interface;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeEx {
    public static void main(String[] args) {

        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(3);
        deque.addFirst(7);
        deque.addLast(6);
        deque.offerFirst(9);
        deque.offerLast(1);
        System.out.println(deque);

        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());

        System.out.println(deque.removeFirst());
        System.out.println(deque);

        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());

        System.out.println(deque.removeLast());
        System.out.println(deque);

        System.out.println(deque.pollFirst());
        System.out.println(deque);

        System.out.println(deque.pollLast());
        System.out.println(deque);
    }
}
