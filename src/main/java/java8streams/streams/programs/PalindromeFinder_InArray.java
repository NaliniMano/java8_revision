package java8streams.streams.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PalindromeFinder_InArray {

    public static void findPalindrome(String[] input)
    {
        List<String> list = Arrays.asList(input);
        List<String> outputlist=list.stream().filter(PalindromeFinder_InArray::isPalidrome).collect(Collectors.toList());
        System.out.println(outputlist);

    }
    public static void main(String[] args) {
        String[] postive_input={"cac","fgh","pap"};
        String[] negative_input={};
        String[] edge={"A","B","C"};
        String[] edge2={"aa","aaa","aaaa"};
        findPalindrome(postive_input);
        findPalindrome(negative_input);
        findPalindrome(edge);
        findPalindrome(edge2);
    }

    public static boolean isPalidrome(String word)
    {
        return word.equals(new StringBuilder(word).reverse().toString());
    }

}
