package Ambarjeet_100DaysOfCode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class indicesOfPeak_Day50 {
    static void findPeak(int a[])
    {
        List<Integer> peakIndices= IntStream.range(1,a.length-1)
                .boxed()
                .filter(i->a[i]>a[i-1] && a[i]>a[i+1])
                .collect(Collectors.toList());

        System.out.println("Indices of Peak : "+peakIndices);

    }
    public static void main(String[] args) {
        int a[]={1,4,3,8,5}; // 1,4,3,8,5
        System.out.println("Input : "+Arrays.toString(a));
        findPeak(a);
    }
}
