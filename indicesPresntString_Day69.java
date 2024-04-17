package Ambarjeet_100DaysOfCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class indicesPresntString_Day69 {
    static List<Integer> indiceString(String[] words)
    {
        char ch='a';
        List<Integer> strIndices=new ArrayList<>();
        for (int i=0;i<words.length;i++)
        {
            if (words[i].indexOf(ch)!=-1) {
                strIndices.add(i);
            }
        }
        return strIndices;
    }
    public static void main(String[] args) {
        String words[]={"abc","bcd","aaaa","cbc"};
        System.out.println("Input : "+Arrays.toString(words));
        System.out.println("Indices of String Containing Character : "+indiceString(words));
    }
}
