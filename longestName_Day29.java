package Ambarjeet_100DaysOfCode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class longestName_Day29 {
    static String findlongName(List<String> names)
    {
        final String vowel="aeiou";

        String result= Collections.singletonList(names.stream()
                .filter(n -> vowel.contains(n.substring(0, 1)))
                .filter(n -> !vowel.contains(n.substring(n.length() - 1)))
                .max((o1, o2) -> Integer.compare(o1.length(), o2.length()))
                .get()).toString();

        return "Longest name : "+result;
    }
    public static void main(String[] args) {
        List<String> names= Arrays.asList("sun","java","book","ambarjeet","kavita",
                "page","orange");
        System.out.println("List : "+names);
        System.out.println(findlongName(names));
    }
}
