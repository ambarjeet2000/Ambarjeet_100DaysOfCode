package Ambarjeet_100DaysOfCode;

import java.util.*;
public class sortColors_Day31 {
    static void sortColors()
    {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter Colors");
        String input=sc1.next();

        String words[]=input.split(",");

        Set<String> distintWords=new HashSet<>();
        Collections.addAll(distintWords,words);

        List<String> sortWord=new ArrayList<>(distintWords);
        Collections.sort(sortWord);

        System.out.println("sorted : "+sortWord);
    }
    public static void main(String[] args) {
        sortColors();
    }
}
