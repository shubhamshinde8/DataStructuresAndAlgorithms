package ConditionalsStatement;

import java.util.Scanner;

public class Divisible5orNot {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n=sc.nextInt();

        while (n%5==0){
            System.out.println("divisible");
            System.out.println("Enter a number ");
            n=sc.nextInt();
        }
    }
}
