package code.collections;

import java.util.ArrayList;

public class CollectionExcercise {
    public static void main (String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("Mike");
        strings.add("Abe");

        for (String name : strings) {
            System.out.println(name.length());
        }
    }
}
