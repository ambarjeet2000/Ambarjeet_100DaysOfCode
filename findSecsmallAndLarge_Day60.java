package Ambarjeet_100DaysOfCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findSecsmallAndLarge_Day60 {
    static void findSecSmall(List<Integer> l1)
    {
        int result1= l1.stream()
                .sorted()
                .skip(1)
                .findFirst().
                get();

        System.out.println("Second Smallest Element : "+result1);
    }
    static void largest(List<Integer> l1)
    {
        int result2=l1.stream()
                .sorted((a,b)->Integer.compare(b,a))
                .skip(1)
                .findFirst()
                .get();

        System.out.println("Second Largest Element : "+result2);
    }
    public static void main(String[] args) {
        List<Integer> l1=new ArrayList<>(Arrays.asList(41,17,33,29,6,76,52));

        System.out.println("List : "+l1);
        findSecSmall(l1);
        largest(l1);
    }
}
