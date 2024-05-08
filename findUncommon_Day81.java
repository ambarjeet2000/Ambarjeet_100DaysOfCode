package Ambarjeet_100DaysOfCode;

public class findUncommon_Day81 {
    public static void main(String[] args) {
        System.out.println("Input : ");
        String str1="geeksforgeeks";
        String str2="geeksquiz";
        System.out.println(str1);
        System.out.println(str2);

        String str=str1+str2;
        int count=0;
        char a[]=str.toCharArray();
        System.out.print("Output : ");
        for (int i=0;i<a.length;i++) {
            count=0;
            for (int j=i+1;j<a.length;j++) {
                if (a[i]==a[j])
                {
                    count++;
                    a[j]=' ';
                }
            }
            if (count==0 && a[i]!=' ') {
                System.out.print(a[i]+" ");
            }
        }
    }
}
