package part4_Collections.queue_Interface;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListExampleLikeQueue {
    public static void main(String[] args) {

        Queue <String> queue = new LinkedList<>();
        queue.add("Sofi");
        queue.add("Vitalij");
        queue.add("Viki");
        queue.add("Mari");
        queue.add("Anna");
        System.out.println(queue);
    }
}
