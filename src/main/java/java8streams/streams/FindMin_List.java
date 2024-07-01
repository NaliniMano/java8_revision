package java8streams.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindMin_List {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(5,56,45,-99,-103);
        Optional<Integer> min_val=li.stream().min(Integer::compareTo);
        System.out.println(min_val);
    }
}
