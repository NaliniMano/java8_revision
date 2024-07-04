package java8Optional;

import java.util.Optional;

public class OptionalClass_Map {
    public static void main(String[] args) {

        /**
         *
         * optional.map(String::toUpperCase) applies the toUpperCase method to the value "raki"
         * and returns an Optional containing the result "RAKI"
         */
        Optional<String>  name =  Optional.of("raki");
        Optional<String> name2=name.map(String::toUpperCase);
        System.out.println(name2.get() +",Original="+name.get());

        /**
         * Map to different types
         */
        Optional<String> option1=Optional.of("123");
        Optional<Integer> option_int=option1.map(Integer::parseInt);
        System.out.println(option_int.get()*10);
        /**
         * HAndling Empty
         */
        Optional<String> emptystr=Optional.empty();
        Optional<String> str2=emptystr.map(String::toUpperCase);
        if(!str2.isPresent())
            System.out.println("Value not present");
        /**
         * Custom function
         */
        Optional<String> str=Optional.of("apple");
        Optional<String> modify_str=str.map(value->new StringBuffer(value).reverse().toString());
        System.out.println(modify_str.get());

        /**
         * FlatMap : Nested optional
         *
         */
        Optional<Optional<String>> nestedOpt = Optional.of(Optional.of("Nested Heloo"));
        Optional<String> flatmap=nestedOpt.flatMap(opt->opt);
        System.out.println(flatmap.get());


    }



}
