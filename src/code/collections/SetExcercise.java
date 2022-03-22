package code.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * Sets: avoid duplicate elements
 */
public class SetExcercise {
    public static void main (String[] args) {

        Set<String> mySet = new HashSet<String>();
        mySet.add("Hello");
        mySet.add("Hello");
        mySet.add("Hello");
        mySet.add("Hellos");

        for (String text : mySet) {
            System.out.println(text);
        }

        List<String> numbers = new ArrayList<String>();
        numbers.add("123-222-3333");
        numbers.add("223-222-3333");
        numbers.add("123-332-3333");
        numbers.add("123-222-4433");
        numbers.add("123-222-1133");
        numbers.add("123-222-3333");
        numbers.add("123-222-3333");
        numbers.add("123-232-4533");
        numbers.add("123-562-3333");
        numbers.add("123-000-3333");
        numbers.add("555-222-3333");
        numbers.add("444-222-3333");

        // create set from another collection
        Set<String> uniqueNumbers = new HashSet<String>(numbers);
        for (String number : uniqueNumbers) {
            System.out.println(number);
        }
    }
}
