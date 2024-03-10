package Ambarjeet_100DaysOfCode;

public class addEnd_Day56 {
    static String addEnd(String str)
    {
        if (str.length()>=3) {
            if (str.endsWith("ing"))
            {
                str=str+"ly";
            }
            else
            {
                str=str+"ing";
            }
        }
        return str;
    }
    public static void main(String[] args) {
        String str1="Float";
        System.out.println("Input 1 : "+str1);
        System.out.println("Output : "+addEnd(str1));
        String str2="String";
        System.out.println("Input 2 : "+str2);
        System.out.println("Output : "+addEnd(str2));
    }
}
