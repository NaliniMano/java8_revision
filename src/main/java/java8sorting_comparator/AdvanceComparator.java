package java8sorting_comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AdvanceComparator {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));

        people.sort(Comparator.comparingInt(Person ::getAge).thenComparing(Person::getName));
        people.forEach(System.out::println);

    }
}
