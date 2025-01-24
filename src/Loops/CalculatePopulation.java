package Loops;

import java.util.Scanner;

public class CalculatePopulation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter current population : ");
        int cp=sc.nextInt();

        System.out.println("Enter Birth Rate : ");
        float br=sc.nextFloat();

        System.out.println("Enter Death Rate : ");
        float dr=sc.nextFloat();

        System.out.println("Enter Days : ");
        int days=sc.nextInt();

        float np=0;

        for (int i=1;i<=days;i++){
            np=cp+(cp*br)-(cp*dr);
            cp=(int)np;
        }

        System.out.println(np);
    }
}
