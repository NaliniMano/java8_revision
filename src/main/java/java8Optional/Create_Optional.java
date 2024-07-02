package java8Optional;

import java.util.Optional;

public class Create_Optional {

    //Optional class are used to handle null pointer exeception

    public static void main(String[] args) {
        //below code help to create Optional object using static method "empty"
        Optional<String> stringOptional= Optional.empty();
        System.out.println(stringOptional.isPresent());

        //below code help to create Optional object using static method "of"
        //Note *** object present in the of(<Object>) should be non nullable else it throw null pointer execep
        String name="Blessed";
        Optional<String> stringOptional_of=Optional.of(name);
        System.out.println(stringOptional_of.get());

        //below code help to create Optional object using static method "ofnullable"

        String first_name="Hello";
        first_name=null;
        Optional<String> stringOptional_ofnull=Optional.ofNullable(first_name);
        System.out.println(stringOptional_ofnull.isPresent());



    }

}
