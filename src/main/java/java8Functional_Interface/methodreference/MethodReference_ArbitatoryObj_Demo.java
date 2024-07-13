package java8Functional_Interface.methodreference;

import java.util.function.Function;

public class MethodReference_ArbitatoryObj_Demo {

    public static void main(String[] args) {
        Function<String,String> function = String::toLowerCase;
        String output=function.apply("Hello WORLD...");
        System.out.println(output);
    }
}
