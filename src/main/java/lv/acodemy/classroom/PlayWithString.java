package lv.acodemy.classroom;

public class PlayWithString {
    public static void main(String[] args) {

        String name = "Aleksandrs";
        String surname = "Taranenko";

        // My name is: Aleksandrs Taranenko

        // Concatenation
        System.out.println("My name is: " + name + " " + surname);

        // Interpolation
        // %s - for text
        // %d - for numeric values

        String interpolation = String.format("My name is: %s %s", name, surname);
        System.out.println(interpolation);
        System.out.println(String.format("My name is: %s %s", name, surname));

        // ClassWork

        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName);

        int age = 25;
        String city = "New York";
        System.out.println(firstName + " " + lastName + " is " + age + " years old and lives in " + city + ".");
        System.out.println(String.format("%s %s is %d years old and lives in %s.", firstName, lastName, age, city));
        // With variable:
        /*
        String text2 = firstName + " " + lastName + " is " + age + " years old and lives in " + city + ".";
        System.out.println(text2);
        String text = String.format("%s %s is %d years old and lives in %s.", firstName, lastName, age, city);
        System.out.println(text);
         */
    }
}
