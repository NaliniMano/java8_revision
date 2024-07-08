package java8Functional_Interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Lamda_Consumer_Supplier {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
        Consumer<Integer> consumer = System.out::println;
        list.forEach(consumer);

        Supplier<Double> supp=Math::random;
        Double random_number = supp.get();
        System.out.println(random_number);



    }
}
