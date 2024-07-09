package java8Functional_Interface.consumer_example;

import java.util.function.Consumer;

public class Consumer_Demo {

    public void consumerexample(){
        Consumer<String> consumer =(input)->{
          System.out.println("Consumer Demo"+input);
        };
    }

    public void consumer_defaultmethod(){
        Consumer<String> consumer1 =(input)->{
            System.out.println("Consumer1"+input);};
            Consumer<String> consumer2 =(input)->{
                System.out.println(" from Consumer 2"+input);};
            consumer1.andThen(consumer2).accept("Hello World");
    }

    public static void main(String[] args) {
        Consumer_Demo cd =new Consumer_Demo();
        cd.consumerexample();
        cd.consumer_defaultmethod();
    }
}
