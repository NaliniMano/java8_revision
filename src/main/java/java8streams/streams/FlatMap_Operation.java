package java8streams.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap_Operation {
    public static void main(String[] args) {
        //combines nested stream into single stream
        List<List<String>> li = Arrays.asList(Arrays.asList("java","selenium"),
                                              Arrays.asList("Testng","Cucumber"),
                                              Arrays.asList("Git","jenkins"));
        List<String> li_flatlist=li.stream().flatMap(List::stream).collect(Collectors.toList());
        System.out.println(li_flatlist);

        //Result [java, selenium, Testng, Cucumber, Git, jenkins]
    }
}
