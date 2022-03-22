package code.collections;

import java.util.LinkedList;
import java.util.Queue;
/*
 * Queue: preserve the order of elements
 */
public class QueueExcercise {
    public static void main (String[] args) {
        // create a Queue
        // the concrete implementation is LinkedList
        Queue<String> queuedCustomers = new LinkedList<String>();

        // customer takes a number
        queuedCustomers.add("1234");
        queuedCustomers.add("3412");
        queuedCustomers.add("0123");
        queuedCustomers.add("4321");

        while (!queuedCustomers.isEmpty()) {
            System.out.println("Customer " + queuedCustomers.poll() + " is getting helped");
        }
    }
}
