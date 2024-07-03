package java8Optional;

import java.util.Optional;

public class OptionalClassMethod_Else {
    public static void main(String[] args) {


        /**main purpose of optional class to avoid null pointer exception
         * orElse(defaultValue) returns the value if present; otherwise, it returns the default value.
         * orElseGet(supplier) returns the value if present; otherwise, it calls the supplier function to get the default value.         *
         */
        Optional<String> option2 = Optional.ofNullable(null);
        String str1 = option2.orElse("Default value");
        System.out.println(option2.orElseGet(()->"DEfault value from supplier"));
        System.out.print(str1);


    }
}
