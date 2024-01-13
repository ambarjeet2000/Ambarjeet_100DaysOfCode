package Ambarjeet_100DaysOfCode;
/*
Q. Write a function to reverse a string without using any built-in string reversal functions.
Q. Write a program to reverse the elements in an array.
 */

public class reverseProgram_Day2 {
    static void revArray(int a[])
    {
        System.out.println();
        for (int i=a.length-1;i>=0;i--)
        {
            System.out.print(a[i]+" ");
        }
    }
    static String revString(String str)
    {
        System.out.println();
        String a[]=str.split(" ");
        for (int i=a.length-1;i>=0;i--)
        {
            System.out.print(a[i]+" ");
        }
        return str;
    }
    public static void main(String[] args) {
        int a[]={100,99,98,97,96,95};
        System.out.println("** Array Reverse **");
        for (int k : a)
        {
            System.out.print(k+" ");
        }
        revArray(a);

        System.out.println("\n** String Reverse **");
        String str="India is my country";
        revString(str);
        System.out.println("\n"+str);
    }
}
