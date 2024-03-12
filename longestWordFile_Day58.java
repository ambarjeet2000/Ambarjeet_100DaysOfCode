package Ambarjeet_100DaysOfCode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class longestWordFile_Day58 {
    public static void main(String[] args) {

        int maxLength=0;
        String longWord="";
        try {
            File f1=new File("D://ambar.txt");
            Scanner sc1=new Scanner(f1);

            while (sc1.hasNext())
            {
                String currWord=sc1.next();
                int currWordLength=currWord.length();

                if (currWordLength>maxLength)
                {
                    longWord=currWord;
                    maxLength=currWordLength;
                }
            }
            sc1.close();

            System.out.println("Longest Word : "+longWord);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
