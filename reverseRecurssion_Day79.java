package Ambarjeet_100DaysOfCode;

public class reverseRecurssion_Day79 {
    static int revNumber(int num, int revNum) {
        if (num == 0) {
            return revNum;
        }
        int lastDig=num%10;
        revNum=revNum*10+lastDig;

        return revNumber(num/10,revNum);
    }
    public static void main(String[] args) {
        int num=56789;
        System.out.println("Input : "+num);
        System.out.println("Reverse Number : "+revNumber(num,0));
    }
}
