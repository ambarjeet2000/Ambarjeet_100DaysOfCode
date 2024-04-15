package Ambarjeet_100DaysOfCode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class concatStream_Day67 {
    static String concatStream(List<String> words)
    {
        String res=words.stream()
                .collect(Collectors.joining(","));

        return "Concate List : "+res;
    }
    public static void main(String[] args) {
        List<String> words= Arrays.asList("Java","Summer","Plant","Water","Pen");

        System.out.println("Input : "+words);
        System.out.println(concatStream(words));
    }
}
