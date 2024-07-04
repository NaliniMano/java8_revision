package java8Optional;

import java.util.Optional;

public class Optional_Handlenull {
    public static void main(String[] args) {
        /**
         * orElseThrow(exceptionSupplier) returns the value if present; otherwise,
         it throws an exception created by the given supplier function.
         */
        String value=getValue();
        Optional<String> optional = Optional.ofNullable(value);
        if(!optional.isPresent())
            optional.orElseThrow(()->new IllegalArgumentException("Value is null"));

    }

    public static String getValue() {
        return null;
    }
}
