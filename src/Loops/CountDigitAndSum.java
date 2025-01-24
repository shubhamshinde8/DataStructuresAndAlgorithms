package Loops;

import java.util.Scanner;

public class CountDigitAndSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n=sc.nextInt();
        int orgNum=n;

        int digit_sum=0;
        while (n>0){
            digit_sum=digit_sum+n%10;
            n/=10;
        }

        int ans=orgNum/digit_sum;
        System.out.println(ans);
    }
}
