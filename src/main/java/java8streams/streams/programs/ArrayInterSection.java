package java8streams.streams.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayInterSection {
    /**
     * Given two integer array , combine two array remove the duplicates
     *
     */
    public static void doArrayInterSection(int[] arr1,int[] arr2)
    {
      List<Integer> outputlist=  IntStream.concat(Arrays.stream(arr1),Arrays.stream(arr2)).boxed()
                .distinct().collect(Collectors.toList());
      System.out.println(outputlist);
    }
    public static void main(String[] args) {

        int[] input1={2,3,4,5,6};
        int[] input2={2,3,9};
        doArrayInterSection(input1,input2);

        int[] edge_input1={2,3,4,5,6};
        int[] edge_input2={};
        doArrayInterSection(edge_input1,edge_input2);

        int[] negative_case1={};
        int[] negative_case2={};
        doArrayInterSection(negative_case1,negative_case2);
    }

}
