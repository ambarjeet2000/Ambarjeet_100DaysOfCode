package Ambarjeet_100DaysOfCode;

public class findNonRepeatative_Day11 {
    public static void main(String[] args) {
        String str="sunset glow on the horizon";

        char a[]=str.replace(" ","").toCharArray();
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<a.length;i++)
        {
            int count=0;
            for (int j=0;j<a.length;j++)
            {
                if (a[i]==a[j])
                {
                    count++;
                }
            }
            if (count==1)
            {
                sb.append(a[i]);
            }
        }
        System.out.println("First non-Repeatative Character in String : "+sb.charAt(0));
        System.out.println("Non Repeatative Character in String : "+sb);
    }
}
