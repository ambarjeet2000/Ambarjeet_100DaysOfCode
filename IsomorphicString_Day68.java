package Ambarjeet_100DaysOfCode;

import java.util.HashMap;
public class IsomorphicString_Day68 {
    static boolean checkIsomorphic(String str1, String str2)
    {
        if (str1.length()!=str2.length()) {
            return false;
        }
        HashMap<Character,Character> h1=new HashMap<>();
        for (int i=0;i<str1.length();i++)
        {
            char ch1=str1.charAt(i);
            char ch2=str2.charAt(i);

            if (h1.containsKey(ch1)) {
                if (h1.get(ch1)!=ch2) {
                    return false;
                }
            }
            else {
                if (h1.containsValue(ch2)) {
                    return false;
                }
                h1.put(ch1,ch2);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str1="aab";
        System.out.println("Str1 : "+str1);
        String str2="xxy";
        System.out.println("Str2 : "+str2);


        if (checkIsomorphic(str1,str2)) {
            System.out.println("Strings are Isomorphic");
        } else {
            System.out.println("Strings are not Isomorphic");
        }
    }
}
