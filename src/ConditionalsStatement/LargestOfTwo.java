package ConditionalsStatement;

import java.util.Scanner;

public class LargestOfTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st Number : ");
        int a=sc.nextInt();
        System.out.println("Enter 2nd Number : ");
        int b=sc.nextInt();

        if(a>b){
            System.out.println(a+" Is Greater ");
        }
        else{
            System.out.println(b+" Is Greater ");
        }
    }
}
