package Ambarjeet_100DaysOfCode;

public class stringSwap_Day76 {
    static String swapString(String str1, String str2) {
        StringBuilder sb=new StringBuilder();
        sb.append(str2.substring(0,2));
        sb.append(str1.substring(2));
        sb.append(" ");
        sb.append(str1.substring(0,2));
        sb.append(str2.substring(2));

        return sb.toString();
    }
    public static void main(String[] args) {
        String str1="abc";
        String str2="xyz";
        System.out.println("Input : "+str1+" "+str2);
        System.out.println("Output : "+swapString(str1,str2));
    }
}
