package code.collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/*
 * Wrapper Object. To wrap primitive variable types into objects.
 * For example, Integer, Double, Float
 */
public class WrapperSorting {
    public static void main (String[] args) {
        List<Integer> numbers = new LinkedList<Integer>();
        numbers.add(201);
        numbers.add(100);
        numbers.add(101);

        for (Integer number : numbers) {
            System.out.println(number);
        }

        Collections.sort(numbers);
        System.out.println("========Sorted========");

        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
