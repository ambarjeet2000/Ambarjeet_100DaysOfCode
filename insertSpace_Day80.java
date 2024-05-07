package Ambarjeet_100DaysOfCode;

import java.util.Arrays;

public class insertSpace_Day80 {
    static String insertSpace(String words) {
        StringBuilder sb=new StringBuilder();

        for (int i=0;i<words.length();i++)
        {
            char ch=words.charAt(i);
            if (Character.isUpperCase(ch) && i>0)
            {
                sb.append(' ');
            }
            sb.append(ch);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String [] words= {"JavaExercises", "PythonExercisesPracticeSolution"};

        for (String w : words)
        {
            System.out.println(w);
        }
        System.out.println(insertSpace(Arrays.toString(words)));
    }
}
