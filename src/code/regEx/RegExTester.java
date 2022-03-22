package code.regEx;

public class RegExTester {
    public static void main (String[] args) {
        try {
            Person person = new Person("Jeff", "jeff@gmail.com");
            System.out.println(person);
        } catch (Exception ex) {
            System.out.println(ex.getLocalizedMessage());
        }
    }
}
