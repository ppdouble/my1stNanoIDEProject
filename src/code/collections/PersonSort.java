package code.collections;

import java.util.ArrayList;
import java.util.Collections;

public class PersonSort {
    public static void main (String[] args) {
        ArrayList<Person> people = new ArrayList<Person>();

        people.add(new Person("Same", "same@email.com"));
        people.add(new Person("Mike", "mike@email.com"));
        people.add(new Person("Apple", "apple@email.com"));

        for (Person person : people) {
            System.out.println(person.getName());
        }

        Collections.sort(people);
        System.out.println("========Sorted========");

        for (Person person : people) {
            System.out.println(person.getName());
        }
    }
}
