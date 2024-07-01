package java8streams.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindMax_List {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(23,45,-2,-34,59);
        Optional<Integer> max=li.stream().max(Integer::compareTo);
        System.out.println(max);
    }
}
