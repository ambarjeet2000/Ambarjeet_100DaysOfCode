package Ambarjeet_100DaysOfCode;

public class getFirstLastChar_Day24 {
    static String getOp(String str)
    {
        if (str.length()<2)
        {
            return "Empty String";
        }
        else
        {
            return "Output : "+str.substring(0,2)+str.substring(str.length()-2);
        }
    }
    public static void main(String[] args) {
        String str1="w3resource";
        System.out.println("Input : "+str1);
        System.out.println(getOp(str1));

        String str2="w3";
        System.out.println("Input : "+str2);
        System.out.println(getOp(str2));

        String str3="w";
        System.out.println("Input : "+str3);
        System.out.println(getOp(str3));
    }
}
