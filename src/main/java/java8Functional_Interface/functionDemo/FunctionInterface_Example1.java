package java8Functional_Interface.functionDemo;

import java.util.function.Function;

public class FunctionInterface_Example1 {

    public void function_demo(){

        Function<Integer,Double> usdtoinr = (usd)->usd*82.45;
        System.out.println(usdtoinr.apply(10));
    }

    public static void main(String[] args) {
           FunctionInterface_Example1 example1 =new FunctionInterface_Example1();
           example1.function_demo();
    }
}
