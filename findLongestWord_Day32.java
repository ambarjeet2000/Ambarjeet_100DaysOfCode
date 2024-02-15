package Ambarjeet_100DaysOfCode;
/* Write a Java function that takes a list of words and return the longest word and the length of the longest one.
Sample Output:
Longest word: Exercises
Length of the longest word: 9 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findLongestWord_Day32 {
    static String findLongestWord(List<String>words)
    {
        String longWord=words.get(0);
        int max=longWord.length();
        for (String word : words)
        {
            int current=word.length();
            if (current>max)
            {
                longWord=word;
                max=current;
            }
        }
        return "Longest Word : "+longWord+"\nLength of Word : "+max;
    }
    public static void main(String[] args) {
        List<String> words=new ArrayList<>(Arrays.asList("Java","Orange","Sunflower","Laptop","India"));

        System.out.println(words);
        System.out.println(findLongestWord(words));
    }
}
