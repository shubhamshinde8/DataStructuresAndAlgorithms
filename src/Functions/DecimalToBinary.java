package Functions;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Decimal Number : ");
        int n=sc.nextInt();

        decimalNumber(n);
    }

    static void decimalNumber(int n){

        int pow=0;
        int binaryNum=0;

        while (n>0){
            int rem=n%2;
            binaryNum=binaryNum+ (rem*(int)Math.pow(10,pow));
            pow++;
            n/=2;
        }

        System.out.println(binaryNum);
    }
}
