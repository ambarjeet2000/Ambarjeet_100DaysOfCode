package Ambarjeet_100DaysOfCode;
/* Write Java Program to Check if Two Strings are Anagram

Input : s1 = "listen"
s2 = "silent"
Output : The strings are anagrams. */

import java.util.Arrays;

public class checkAnagram_Day46 {
    static void checkAnagram(String str1, String str2)
    {
        char a[]=str1.toCharArray();
        char b[]=str2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if (Arrays.equals(a,b))
        {
            System.out.println("Strings are Anagram");
        } else {
            System.out.println("Strings are not Anagram");
        }
    }
    public static void main(String[] args) {
        String str1="listen";
        System.out.println("s1 : "+str1);
        String str2="silent";
        System.out.println("s2 : "+str2);
        checkAnagram(str1,str2);
    }
}
