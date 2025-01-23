package ConditionalsStatement;

import java.util.Scanner;

public class CheckEvenOdd {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st Number : ");
        int a=sc.nextInt();

        if(a%2==0){
            System.out.println("Even Number ");
        }else{
            System.out.println("ODD Number ");
        }
    }
}
