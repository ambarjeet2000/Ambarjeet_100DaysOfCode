package Ambarjeet_100DaysOfCode;

public class oddIndexValues_Day54 {
    static String removeOdd(String str)
    {
       StringBuilder sb=new StringBuilder();
       for (int i=0;i<str.length();i=i+2)
       {
           sb.append(str.charAt(i));
       }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str="Good Day Greate Day..!!";
        System.out.println(str);
        System.out.println(removeOdd(str));
    }
}
