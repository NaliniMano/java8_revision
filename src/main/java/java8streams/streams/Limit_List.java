package java8streams.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Limit_List {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1,5,3,2,6,7,2,1);
        List<Integer>li_limit=li.stream().limit(5).collect(Collectors.toList());
        System.out.println(li_limit);

    }
}
