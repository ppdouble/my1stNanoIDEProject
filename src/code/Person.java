package code;

public class Person {

    private String firstName;
    private String lastName;
    private String address;
    private String work;

    public Person (String firstName, String lastName, String address, String work) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.work = work;
    }

    public String getFirstName () {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getWork() {
        return work;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setWork(String work) {
        this.work = work;
    }

    /**
     * This method an override of toString()
     * Print the object out where they actually have meaning
     *
     */
    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", work='" + work + '\'' +
                '}';
    }

    public void eat (String food) {
        String response = "I love eating ";
        System.out.println(response + food);
    }
}
