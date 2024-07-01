package java8streams.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedList {
    public static void main(String[] args) {
        List<String > li = Arrays.asList("ghj","qwe","qwe","wee","aaa");
        List<String> li_sorted=li.stream().sorted().collect(Collectors.toList());
        System.out.println(li_sorted);
    }
}
