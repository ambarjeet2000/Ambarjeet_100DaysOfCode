package Ambarjeet_100DaysOfCode;
/* . */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class findRoot_Day34 {
    static List<Double> findRoot(List<Double> numbers)
    {
        List<Double> result=numbers.stream()
                .filter(i->i>=0)
                .map(i->Math.sqrt(i))
                .sorted((a,b)->b.compareTo(a)).limit(5)
                .collect(Collectors.toList());

        return result;
    }
    public static void main(String[] args) {
        List<Double> numbers=new ArrayList<>(Arrays.asList(-3.0,-6.0,-4.0,-2.0,3.0,6.0,1.0,4.0,2.0,5.0,9.0,-7.0));
        System.out.println("Input : \n"+numbers);
        System.out.println("Output : \n"+findRoot(numbers));

    }
}
