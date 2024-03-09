package Ambarjeet_100DaysOfCode;

public class lastTwoRepeat_Day55 {
    static String twoCopies(String str)
    {
        if (str.length()<2)
        {
            return str;
        }
        char last=str.charAt(str.length()-1);
        char secLast=str.charAt(str.length()-2);

        StringBuilder sb=new StringBuilder();
        for (int i=0;i<4;i++)
        {
            sb.append(secLast);
            sb.append(last);
        }
        return "Output : "+sb.toString();
    }
    public static void main(String[] args) {
        String str="Java";
        System.out.println("Input : "+str);
        System.out.println(twoCopies(str));
    }
}
