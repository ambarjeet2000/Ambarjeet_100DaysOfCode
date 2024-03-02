package Ambarjeet_100DaysOfCode;

import java.util.HashSet;
import java.util.Scanner;

/* */
public class getUniqueChar_Day48 {
    static void getUnique(String str)
    {
       char a[]=str.toCharArray();
       for (int i=0;i<a.length;i++)
       {
           if (str.indexOf(a[i])==str.lastIndexOf(a[i]))
           {
               System.out.println("Unique Character : "+a[i]);
               break;
           }
       }
    }
    public static void main(String[] args) {
        String str="abcab";
        System.out.println("Input : "+str);
        getUnique(str);


    }
}
