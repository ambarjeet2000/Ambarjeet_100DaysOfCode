package Ambarjeet_100DaysOfCode;

import java.util.Scanner;

public class arithmeticOpr_Day1 {
    public static void main(String[] args) throws InterruptedException {
        String heading="** || Calculator || **";
        char a[]=heading.toCharArray();
        for (int i=0;i<a.length;i++)
        {
            Thread.sleep(60);
            System.out.print(a[i]);
        }

        String condition;
        do {
            Scanner sc1=new Scanner(System.in);
            System.out.print("\nEnter First Number : ");
            int num1=sc1.nextInt();
            System.out.print("Enter Second Number : ");
            int num2=sc1.nextInt();

            System.out.println(">> Select Operation <<");
            System.out.println("1 : Addition");
            System.out.println("2 : Subtraction");
            System.out.println("3 : Division");
            System.out.println("4 : Multiplication");

            System.out.println("Choose Operation");
            int choice=sc1.nextInt();
            switch (choice)
            {
                case 1 :
                    int sum=num1+num2;
                    System.out.println("Addition = "+sum);
                    break;
                case 2 :
                    int sub=num1-num2;
                    System.out.println("Subtraction = "+sub);
                    break;
                case 3 :
                    try {
                        double div=num1/num2;
                        System.out.println("Division = "+div);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    break;
                case 4 :
                    int multi=num1*num2;
                    System.out.println("Multiplication = "+multi);
                    break;
            }
            System.out.println("Do you Want to Continue...(Press Y for Yes & N for No)");
            condition=sc1.next();
            if (condition.equals("N") || condition.equals("n"))
            {
                String no="** Thank You...!!! **";
                char b[]=no.toCharArray();
                for (int k=0;k<b.length;k++)
                {
                    Thread.sleep(60);
                    System.out.print(b[k]);
                }
                System.out.println("Thank You...!!!");
            }
        } while (condition.equals("Y") || condition.equals("y"));
    }
}
