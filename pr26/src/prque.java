import java.util.*;

public class prque {
    public static void main(String args[])
    {
        // в порядке возрастания приоритет
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();

        pQueue.add(10);
        pQueue.add(200);
        pQueue.add(55);
        pQueue.add(3);
        pQueue.add(7);

        // верхний элемент
        System.out.println(pQueue.peek());

        // удаление верхнего
        System.out.println(pQueue.poll());


        System.out.println(pQueue.peek());

        System.out.println(pQueue);
    }
}
