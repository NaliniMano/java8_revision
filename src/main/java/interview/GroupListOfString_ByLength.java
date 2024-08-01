package interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupListOfString_ByLength {
    /**
     * Given a list of strings, group them by their length.
     *
     */
    public static void main(String[] args) {
        List<String> inputList= Arrays.asList("apple","berry","date","fig","oranges");
        Map<Integer,List<String>> output =inputList.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(output);
    }
}
