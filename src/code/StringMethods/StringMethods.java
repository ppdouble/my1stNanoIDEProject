package code.StringMethods;

public class StringMethods {
    public static void main (String[] args) {
        String text = "Hello";
        System.out.println(text.charAt(2));
        System.out.println(text.equalsIgnoreCase("hello"));
        System.out.println(text.contains("e"));

        String commaSeperatedString = "This, is, a, comma, sperated, list";
        String[] stringArray = commaSeperatedString.split(",");
        System.out.println(commaSeperatedString.substring(0, 4));
        System.out.println(text.replace("l", "2"));
    }
}
