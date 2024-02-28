package Ambarjeet_100DaysOfCode;

public class decapitalizeFirstLetter_Day45 {
    static String decapitalizeLetter(String str)
    {
        char first=Character.toLowerCase(str.charAt(0));

        return first+str.substring(1);
    }
    public static void main(String[] args) {
        String str="Javascript";
        System.out.println("Input : "+str);
        System.out.println("Output: "+decapitalizeLetter(str));
    }
}
