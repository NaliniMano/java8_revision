package java8streams.streams.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseString {
    /**
     * Given array  of string return the reverse of it using stream
     *
     */
    public static void main(String[] args) {


        List<String> list = Arrays.asList("hello","world");
        List<String> list_out=list.stream().map(str->new StringBuffer(str).reverse().toString()).collect(Collectors.toList());
        System.out.println(list_out);
    }
}
