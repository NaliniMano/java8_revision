package java8streams.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map_operation {
    public static void main(String[] args) {
        //apply function to every element in stream producing new stream
        List<Integer> li = Arrays.asList(1,2,3,4,5,6);
        List<Integer> li_output=li.stream().map(n->n*2).collect(Collectors.toList());
        System.out.println(li_output);

    }
}
