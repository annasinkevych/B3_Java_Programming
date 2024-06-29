package day42_a_collection_map.queue;

import java.util.PriorityQueue;

public class QueueObjects {

    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(2);
        priorityQueue.add(10);
        priorityQueue.add(8);
        priorityQueue.add(1);
        priorityQueue.add(1); //Duplicates are allowed
        //priorityQueue.get(0); //get(index) - comes from List interface, not available for classes that only implement Queue interface
        System.out.println(priorityQueue);
    }
}
