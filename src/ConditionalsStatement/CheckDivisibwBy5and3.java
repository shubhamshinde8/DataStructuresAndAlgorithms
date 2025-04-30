package ConditionalsStatement;

import java.util.Scanner;

public class CheckDivisibwBy5and3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n=sc.nextInt();

        if (n%5==0 && n%3==0){

            System.out.println("Number is divisible by 5 and 3 ");

        }else System.out.println("It is not divisible ");
    }
}
