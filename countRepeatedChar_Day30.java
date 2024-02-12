package Ambarjeet_100DaysOfCode;

import java.util.HashMap;
public class countRepeatedChar_Day30 {
    static HashMap<String, Integer> countChar(String str)
    {
        HashMap<String,Integer> h1=new HashMap<>();
        char a[]=str.toCharArray();

        char lock=' ';
        for (int i=0;i<a.length;i++)
        {
            int c=1;
            for (int j=i+1;j<a.length;j++)
            {
                if (a[i]==a[j])
                {
                    c++;
                    a[j]=lock;
                }
            }
            if (a[i]!=lock)
            {
                if (c!=1)
                    h1.put(String.valueOf(a[i]),c);
            }
        }
        return h1;
    }
    public static void main(String[] args) {
        String str="thequickbrownfoxjumpsoverthelazydog";
        System.out.println("String : "+str);

        System.out.println("Output : "+countChar(str));
    }
}
