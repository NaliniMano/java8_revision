package java8Optional;

import java.util.Optional;

public class OptionalClassMethod_ifPresent {
    public static void main(String[] args) {
        Optional<Integer> option= Optional.of(40);
      //  Optional<Integer> option2= Optional.of(null);
        option.ifPresent(value->System.out.println(value*10));
       // option2.ifPresent(value->System.out.println(value*10));

        //ifPresent(consumer) executes the given consumer function if a value is present.
    }
}
