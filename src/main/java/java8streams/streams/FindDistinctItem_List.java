package java8streams.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindDistinctItem_List {
    public static void main(String[] args) {
        List<Integer> dup_list = Arrays.asList(1,2,2,3,3,4,4);
        List<Integer> distinct_list=dup_list.stream().distinct().collect(Collectors.toList());
        System.out.println(distinct_list);


    }
}

