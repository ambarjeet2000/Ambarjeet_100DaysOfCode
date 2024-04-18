package Ambarjeet_100DaysOfCode;

public class stringModify_Day70 {
    static String modifyString(String str)
    {
        int indexOfPoor = str.indexOf("poor");
        int indexOfNot = str.indexOf("not");

        if (indexOfPoor != -1 && indexOfNot > indexOfPoor) {
            // "not" follows "poor", replace with "good"
            return str.substring(0, indexOfPoor) + "good!" + str.substring(indexOfNot + "not".length());
        } else {
            return str;
        }
    }
    public static void main(String[] args) {
        String str1 = "The lyrics is not that poor!";
        String str2 = "The lyrics is poor!";

        String res1=modifyString(str1);
        String res2=modifyString(str2);

        System.out.println(res1);
        System.out.println(res2);
    }
}
