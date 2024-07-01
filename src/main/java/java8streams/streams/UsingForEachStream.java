package java8streams.streams;

import java.util.Arrays;
import java.util.List;

public class UsingForEachStream {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1,2,5,6,7,8,9);
        li.stream().forEach(i->System.out.println(i*2));
        System.out.println(li);
    }
}
