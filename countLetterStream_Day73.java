package Ambarjeet_100DaysOfCode;

import java.util.Arrays;
import java.util.List;

public class countLetterStream_Day73 {
    public static void main(String[] args) {
        List<String> words= Arrays.asList("parrot","wall","pen","java","apple","paint","tree","pink");

        System.out.println(words);

        char letter='p';

        String res= String.valueOf(words.stream()
                .filter(i->i.startsWith("p"))
                .count());

        System.out.println("Number of words Starts from p : "+res);
    }
}
