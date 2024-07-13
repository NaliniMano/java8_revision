package java8Functional_Interface.methodreference;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MethodRef_ArbitaryObj_MoreExamples {

    /*
    Method references using arbitrary objects are a feature in Java
    that allows you to refer to methods in a concise way.
    This is especially useful with functional interfaces like
    Predicate, Function, Consumer, and Supplier.
     */
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("hello", "", "world", "", "java");

        // Using method reference to check if strings are empty
        Predicate<String> isEmpty = String::isEmpty;

        List<String> nonEmptyStrings = strings.stream()
                .filter(isEmpty.negate())  // Filtering out empty strings
                .collect(Collectors.toList());

        System.out.println("Non-empty strings: " + nonEmptyStrings);

        List<String> words = Arrays.asList("banana", "apple", "cherry");

        // Using method reference to sort strings alphabetically
        words.sort(Comparator.naturalOrder());

        System.out.println("Sorted words: " + words);
    }
}
