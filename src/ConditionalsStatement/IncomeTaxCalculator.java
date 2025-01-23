package ConditionalsStatement;

import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Income  : ");
        int income=sc.nextInt();
        int tax=0;

        if (income<500000){
            System.out.println("You No Need To Pay Tax");
        } else if (income>=500000 && income<10000000) {
            tax= (int) (income*0.2);
            System.out.println("Pay : "+tax);
        }
        else{
            tax= (int) (income*0.3);
            System.out.println("Pay : "+tax);
        }

    }
}
