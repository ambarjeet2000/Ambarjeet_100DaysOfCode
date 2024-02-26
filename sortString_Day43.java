package Ambarjeet_100DaysOfCode;
// Problem : Program to sort a string of numerical characters.
public class sortString_Day43 {
    static String sortNumString(String str)
    {
        StringBuilder res=new StringBuilder();
        for (int i=0;i<=9;i++)
        {
            for (int j=0;j<str.length();j++)
            {
                if ('0'+i==str.charAt(j))
                {
                    res.append(str.charAt(j));
                }
            }
        }
        return "Output : "+res.toString();
    }
    public static void main(String[] args) {
        String str="904835162";
        System.out.println("Input : "+str);
        System.out.println(sortNumString(str));
    }
}
