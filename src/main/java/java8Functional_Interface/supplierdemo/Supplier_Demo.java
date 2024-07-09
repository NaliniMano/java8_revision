package java8Functional_Interface.supplierdemo;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class Supplier_Demo {

    public static void main(String[] args) {
        Supplier<Object> supplier =()->{
            LocalDateTime dateTime = LocalDateTime.now();
            return dateTime.toLocalTime();
        };
        System.out.println(supplier.get());
    }
}
