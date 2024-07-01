package java8streams.streams;

import java.util.Arrays;
import java.util.List;

public class ReduceStream {
    //Combines the element of stream into single result
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1,5,6);
        int sum=li.stream().reduce(0,(a,b)->a+b);
        System.out.println(sum);

    }
}
