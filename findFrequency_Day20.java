package Ambarjeet_100DaysOfCode;

import java.util.HashMap;
import java.util.Map;

public class findFrequency_Day20 {
    static String getcharCount(String str)
    {
        Map<Character,Integer> word=new HashMap<>();
        char a[]=str.toCharArray();

        for (char ch : a)
        {
            if (word.containsKey(ch))
            {
                word.put(ch,word.get(ch)+1);
            }
            else
            {
                word.put(ch,1);
            }
        }
        return str+"\n"+word.toString();
    }
    public static void main(String[] args) {
        String str="google.com";
        System.out.println(getcharCount(str));
    }
}
