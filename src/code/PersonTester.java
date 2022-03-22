package code;

public class PersonTester {

    public static void main (String[] args) {
        Person bob = new Person("Bob", "Biden", "1111 Utopia", "Engineer");
        Person mike = new Person("Mike", "Cliton", "2234 Jaguar", "Teacher");

        System.out.println(bob);
        System.out.println(mike);
    }
}
