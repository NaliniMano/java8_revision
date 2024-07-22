package java8streams.streams.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveVowelCharacter {
    /**
     * Give a String remove the vowel character
     */
    public static void removeVowel(String str)
    {
        List<Character> vowelList= Arrays.asList('a','e','i','o','u','A','E','I','O','U');
        String output=str.chars() // convert to intstream
                     .filter(c->!vowelList.contains((char)c)) //filter vowel char
                   .mapToObj(ch->String.valueOf((char)ch)) //conver int into String
                    .collect(Collectors.joining()); //Join character to form String
        System.out.println(output);
    }
    public static void main(String[] args) {
        String input="Hello World";
        removeVowel(input);
    }
}
