package code.regEx;

import java.util.regex.Pattern;

public class Person {
    private String name;
    private String email;

    private final String emailRegex = "^(.+)@(.+).com$";
    private final Pattern pattern = Pattern.compile(emailRegex);

    public Person (String name, String email) {
        this.name = name;
        this.email = email;
        if (null == email || null == name) {
            throw new IllegalArgumentException("Email or Name should not be null");
        }
        if (!pattern.matcher(email).matches()) {
            throw new IllegalArgumentException("Error, Invalid mail");
        }
    }

    @Override
    public String toString () {
        return "Person{ " +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
