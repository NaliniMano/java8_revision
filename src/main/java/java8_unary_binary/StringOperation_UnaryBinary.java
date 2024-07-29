package java8_unary_binary;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class StringOperation_UnaryBinary {

    public static void main(String[] args) {
        UnaryOperator<String> toUpper=s->s.toUpperCase();

        BinaryOperator<String> strconcat=(s1,s2)->s1+" "+s2;

        List<String> input= Arrays.asList("Hello","World","Unary","Binary" ,"demo");
        List<String> output =input.stream().map(toUpper).collect(Collectors.toList());
        String final_output= output.stream().reduce("",strconcat);

        System.out.println(final_output);

    }
}
