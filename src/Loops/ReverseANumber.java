package Loops;

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n=sc.nextInt();

        int r=0;
        while (n>0){
            int unit_digit=n%10;
            r=r*10+unit_digit;
            n/=10;
        }

        System.out.println(r);
    }
}
