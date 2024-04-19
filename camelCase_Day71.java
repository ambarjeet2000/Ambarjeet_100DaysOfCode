package Ambarjeet_100DaysOfCode;

public class camelCase_Day71 {
    static String convertCamelcase(String str)
    {
        String a[]=str.split("_");

        String res="";

        for (int i=0;i<a.length;i++)
        {
            String f=a[i].substring(0,1).toUpperCase();
            String rs=a[i].substring(1);

            res=res+f+rs;
        }
        return "Output : "+res;
    }
    public static void main(String[] args) {
        String str="addition_number";
        System.out.println("Input : "+str);

        System.out.println(convertCamelcase(str));
    }
}
