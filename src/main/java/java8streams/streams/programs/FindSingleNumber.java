package java8streams.streams.programs;

import java.util.Arrays;

public class FindSingleNumber {
    /**
     *  Given a non-empty array of integers nums,
     * 	 * every element appears twice except for one.
     * 	 * Find that single one.
     */
    public static void findSingleNumber(int[] arr)
    {
       int singlenum= Arrays.stream(arr).reduce(0,(a,b)->a^b);
       System.out.println(singlenum);
    }
    public static void main(String[] args) {
        int[] input_postive={2,3,3,2,9}; //singlenumber : 9
        int[] input_negative={-6,6,-6}; //singlenumber : 6
        int[] input_negative2={};//singlenumber : 0
        int[] edge_case={5};////singlenumber : 5
        int[] edge_case2={5,5}; //singlenumber : 0

        findSingleNumber(input_postive);
        findSingleNumber(input_negative);
        findSingleNumber(edge_case);
        findSingleNumber(edge_case2);
        findSingleNumber(input_negative2);




    }
}
