package java8sorting_comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Comparator_Example {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));

        // Sort by age using a lambda expression
        people.sort(Comparator.comparingInt(Person::getAge));

        System.out.println("Sorted by age:");
        people.forEach(System.out::println);

        // Sort by name using a method reference
        people.sort(Comparator.comparing(Person::getName));

        System.out.println("Sorted by name:");
        people.forEach(System.out::println);
    }
}

