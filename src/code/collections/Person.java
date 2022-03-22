package code.collections;

public class Person implements Comparable<Person>{
    private String name;
    private String email;
    public Person (String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName () {
        return name;
    }

    public String getEmail () {
        return email;
    }

    public int compareTo (Person person) {
        return name.compareTo(person.name);
    }

    @Override
    public String toString () {
        return name + ", " + email;
    }
}
