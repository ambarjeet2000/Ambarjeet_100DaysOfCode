package Ambarjeet_100DaysOfCode;
import java.util.Arrays;

public class commonPrefix_Day15 {
    static String commonPrefix(String str[])
    {
        Arrays.sort(str); // flight flow flower
        String s1=str[0]; // 0th pos
        String s2=str[str.length-1]; // last pos
        int index=0;

        while (index<s1.length() && index<s2.length())
        {
            if (s1.charAt(index)==s2.charAt(index))
            {
                index++;
            }
            else
            {
                break;
            }
        }
        return s2.substring(0,index);
    }
    public static void main(String[] args) {
        String str[]=new String[]{"flower","flow","flight"};
        System.out.println("Longest Common Prefix : "+commonPrefix(str));
    }
}
