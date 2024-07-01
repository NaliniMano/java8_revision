package java8streams.streams;

import java.util.Arrays;
import java.util.List;

public class AnyMatch_List {
    public static void main(String[] args) {
        List<String> li = Arrays.asList("dd","rrt","dfg","56d","add");
        boolean result=li.stream().anyMatch(i->i.contains("d"));
        System.out.println(result);

    }
}
