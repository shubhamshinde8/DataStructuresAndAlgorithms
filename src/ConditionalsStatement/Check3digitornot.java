package ConditionalsStatement;

import java.util.Scanner;

public class Check3digitornot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number : ");

        int n=sc.nextInt();
        if (n>99 && n<=1000){
            System.out.println("it is 3 digit number ");
        }else{
            System.out.println("it is not ");
        }
    }
}
