package Ambarjeet_100DaysOfCode;

public class stringLengthCheck_Day64 {
    public static void main(String[] args) {
        String str="hello geeks for geeks is computer science portal";

        System.out.println("Input : "+str);
        int k=4;
        String a[]=str.split(" ");
        System.out.print("Output : ");
        for (String word : a)
        {
            if (word.length()>4)
            {
                System.out.print(word+" ");
            }
        }
    }
}
