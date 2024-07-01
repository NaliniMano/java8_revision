package java8streams.streams;

import java.util.Arrays;
import java.util.List;

public class CountItem_Stream {
    //count no of elements in stream
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1,4,7,8,3,9,1);
        long noofitems=li.stream().distinct().count();
        System.out.print(noofitems);
    }
}
