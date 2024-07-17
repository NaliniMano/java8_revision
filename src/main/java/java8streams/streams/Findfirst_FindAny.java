package java8streams.streams;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Findfirst_FindAny {
    public static void main(String[] args) {
        /**
         *  findFirst always return first element irrespective of parallel or sequential stream
         *  findany with parallel stream it will return any value
         * findany with sequential stream 99% return first value
         */
        List<String> list = Arrays.asList("one","two","three","four","five");
        Optional<String> findfirst=list.stream().findFirst();
        System.out.println(findfirst.get());

        Optional<String> findany=list.stream().findAny();
        System.out.println(findany.get());

        Optional<String> findany2=list.parallelStream().findAny();
        System.out.println(findany2.get());

    }
}
