package Ambarjeet_100DaysOfCode;

public class wordSortByLeng_Day61 {
    public static void main(String[] args) {
        String str="chocolate india pen naruto book laptop apple";
        System.out.println("Input : "+str);

        String a[]=str.split(" ");
        System.out.println("Word sort by length : ");
        for (int i=0;i<a.length;i++)
        {
            for (int j=i+1;j<a.length;j++)
            {
                if (a[i].length()>a[j].length())
                {
                    String temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            System.out.println(a[i]);
        }
    }
}
