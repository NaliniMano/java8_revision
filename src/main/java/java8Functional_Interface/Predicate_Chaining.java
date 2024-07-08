package java8Functional_Interface;

import java.util.function.Predicate;

public class Predicate_Chaining {

    /**
     * This program will return true if the input number
     * odd number& divisible by 5
     *
     */
    Predicate<Integer> findodd;
    Predicate<Integer> divisibleby5;
    Predicate<Boolean> opposite;

    void andExample()
    {
        findodd= num -> num % 2 !=0;
        divisibleby5= num2 -> num2 % 5==0;
        System.out.println("And Method ="+findodd.and(divisibleby5).test(15));
    }
    void orExample()
    {
        findodd=num->num%2 !=0;
        divisibleby5= num2 -> num2 % 5==0;
        System.out.println("OR method= " +findodd.or(divisibleby5).test(15));
    }

    void negateExample()
    {
        opposite=input->input;
        System.out.println("From Negate= "+opposite.negate().test(true));
    }

    public static void main(String[] args) {
        Predicate_Chaining pchain = new Predicate_Chaining();
        pchain.andExample();
        pchain.orExample();
        pchain.negateExample();
    }
}
