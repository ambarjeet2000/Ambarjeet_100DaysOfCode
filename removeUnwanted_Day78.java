package Ambarjeet_100DaysOfCode;

public class removeUnwanted_Day78 {
    public static String removeUnwantedChar(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if (Character.isLetter(ch) || ch == ' ')
            {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str1 = "A%^!B#*CD";

        System.out.println("Input : " + str1);
        System.out.println("Output : "+removeUnwantedChar(str1));
    }
}
