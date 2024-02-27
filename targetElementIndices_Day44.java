package Ambarjeet_100DaysOfCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class targetElementIndices_Day44 {
    static List<Integer> targetIndices(int[] a, int target)
    {
        List<Integer> list=new ArrayList<>();
        Arrays.sort(a);
        for (int i=0;i<a.length;i++)
        {
            if (a[i]==target)
            {
                list.add(i);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int a[]={1,2,5,2,3};
        System.out.println("Input : "+Arrays.toString(a));
        int target=2;
        System.out.println("List of elements of target Array : "+targetIndices(a,target));
    }
}
