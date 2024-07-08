package java8Functional_Interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Lamda_Predicates {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(11, 12, 13, 15, 16, 17, 18, 19, 20);
        Predicate<Integer> isEven = number -> number % 2 == 0;
        List<Integer> even_list=list.stream().filter(isEven).collect(Collectors.toList());
        System.out.println(even_list);


    }
}
