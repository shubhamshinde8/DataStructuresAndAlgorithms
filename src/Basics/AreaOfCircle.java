package Basics;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter redius : ");
        float r=sc.nextFloat();
        float answer= (float) (r*r*3.14);

        System.out.println(answer);
    }
}
