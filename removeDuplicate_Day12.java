package Ambarjeet_100DaysOfCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class removeDuplicate_Day12 {
    public static void main(String[] args) {
        List<Integer> l1=new ArrayList<>(Arrays.asList(9,6,8,6,4,3,9,1,4));

        System.out.println("Default List : "+l1);

            List<Integer> num =l1.stream().distinct().collect(Collectors.toList());
        System.out.println("Duplicate Remove from List : "+num);

    }
}
