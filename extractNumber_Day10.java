package Ambarjeet_100DaysOfCode;

public class extractNumber_Day10 {
    static int extract(String str)
    {
        int sum=0;
        for (int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if (Character.isDigit(ch))
            {
                System.out.print(ch+" ");
                sum=sum+Integer.parseInt(String.valueOf(ch));
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        String str="1 red 9 black 8 green 7";
        System.out.println("\nSum : "+extract(str));
    }
}
