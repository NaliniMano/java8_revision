package java8_unary_binary;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class UnaryBinaryOperator {
    public static void main(String[] args) {
        List<Integer> inputList = Arrays.asList(1,2,3,4,5,6,7,8,9);
        UnaryOperator<Integer> unary = n->n*n;
        List<Integer> squareList = inputList.stream().map(unary).collect(Collectors.toList());
        BinaryOperator<Integer> binary = (a,b)->a+b;
        int sum=squareList.stream().reduce(0,binary);
        System.out.println(sum);

    }
}
