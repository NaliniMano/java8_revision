package java8Functional_Interface.methodreference;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

public class MethodReference_Constructor_Demo {

    public static void main(String[] args) {
        List<String> petlist=new ArrayList<>();
        petlist.add("cat");
        petlist.add("dog");
        petlist.add("hen");
        petlist.add("fish");
        petlist.add("cat");
        petlist.add("dog");

        //convert list to set

        Set<String> petSet=new HashSet<>(petlist);
        System.out.println(petSet);

        //Convert the code into method referece;
        //className::new

        Function<List<String>,Set<String>> function = HashSet::new;
        System.out.println("Method ref usinf construc ="+function.apply(petlist));





    }
}
