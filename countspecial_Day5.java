package Ambarjeet_100DaysOfCode;
/*
 Write a Java program to count Uppercase, Lowercase, special characters and numeric values
 in a given string.
 */
public class countspecial_Day5 {
    public static void main(String[] args) {
        String str="I Love My India @ 123 I Live in Amravati $ 27 !";
        System.out.println(str);

       char a[]=str.toCharArray();
       int numCount=0,upperCount=0,lowerCount=0,specialCount=0;
       for (int i=0;i<a.length;i++)
       {
           if (Character.isDigit(str.charAt(i)))
           {
               numCount++;
           }
           else if (Character.isUpperCase(str.charAt(i)))
           {
               upperCount++;
           }
           else if (Character.isLowerCase(str.charAt(i)))
           {
               lowerCount++;
           }
           else
           {
               if (a[i]!=' ')
               specialCount++;
           }
       }
        System.out.println("Lowercase Count : "+lowerCount);
        System.out.println("Numeric Count : "+numCount);
        System.out.println("Special Character Count : "+specialCount);
        System.out.println("Uppercase Count : "+upperCount);
    }
}
