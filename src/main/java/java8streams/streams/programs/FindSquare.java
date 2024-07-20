package java8streams.streams.programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FindSquare {
    /*
     * Given sorted integer array in non-decreasing order, return the
     * array of the squares of each number sorted in non-decreasing order
     *
     */
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(4,5,6,7,8);
        List<Integer> output=list.stream().map(n->n*n)
                                       .sorted((a,b)->b-a).collect(Collectors.toList());
        System.out.println(output);

        //another way using Stream API and Comparator
        List<Integer> sort_descending=list.stream().map(n->n*n)
                .sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("sort_descending ="+sort_descending);


    }
}
