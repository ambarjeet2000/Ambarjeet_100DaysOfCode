package Ambarjeet_100DaysOfCode;
// Program to minimize the string.
import java.util.stream.Collectors;

public class minimizeString_Day40 {
    static String minimizeStr(String str)
    {
        String result=str.chars()
                .distinct()
                .mapToObj(i->String.valueOf((char) i))
                .collect(Collectors.joining());

                return result;
    }
    public static void main(String[] args) {
        String str="aaabc";
        System.out.println("Input : "+str);
        System.out.println("Output : "+minimizeStr(str));
    }
}
