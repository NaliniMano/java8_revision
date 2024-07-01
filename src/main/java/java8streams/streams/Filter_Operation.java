package java8streams.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter_Operation {
    //Extract element from stream based on the condi
    public static void main(String[] args) {
        List<String> li = Arrays.asList("aa","bb","acc","add");

        List<String>  li_output=li.stream().filter(str->str.startsWith("a")).collect(Collectors.toList());
        System.out.println(li_output);
    }
}
